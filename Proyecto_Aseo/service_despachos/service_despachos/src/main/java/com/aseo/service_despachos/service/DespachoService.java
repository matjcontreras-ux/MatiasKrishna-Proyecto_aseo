package com.aseo.service_despachos.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.aseo.service_despachos.model.*;
import com.aseo.service_despachos.repository.*;

@Service
public class DespachoService {
    @Autowired private DespachoRepository despachoRepository;
    @Autowired private VehiculoRepository vehiculoRepository;
    @Autowired private RutaEntregaRepository rutaEntregaRepository;

    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();

    public Object obtenerClienteExterno(Long clienteId) {
        return this.webClient.get().uri("/clientes/" + clienteId).retrieve().bodyToMono(Object.class).block();
    }

    public Despacho guardarDespacho(Despacho d) { return despachoRepository.save(d); }
    public List<Despacho> listarDespachos() { return despachoRepository.findAll(); }
    public Despacho obtenerDespacho(Long id) { return despachoRepository.findById(id).orElse(null); }

    public Vehiculo guardarVehiculo(Vehiculo v) { return vehiculoRepository.save(v); }
    public List<Vehiculo> listarVehiculos() { return vehiculoRepository.findAll(); }
    public Vehiculo obtenerVehiculo(Long id) { return vehiculoRepository.findById(id).orElse(null); }

    public RutaEntrega guardarRuta(RutaEntrega r) { return rutaEntregaRepository.save(r); }
    public List<RutaEntrega> listarRutas() { return rutaEntregaRepository.findAll(); }
    public RutaEntrega obtenerRuta(Long id) { return rutaEntregaRepository.findById(id).orElse(null); }
}