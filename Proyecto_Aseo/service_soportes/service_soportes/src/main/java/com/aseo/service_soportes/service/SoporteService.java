package com.aseo.service_soportes.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.aseo.service_soportes.model.*;
import com.aseo.service_soportes.repository.*;

@Service
public class SoporteService {
    @Autowired private TicketSoporteRepository ticketSoporteRepository;
    @Autowired private OperadorRepository operadorRepository;
    @Autowired private HistorialEstadoRepository historialEstadoRepository;

    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();

    public Object obtenerClienteExterno(Long clienteId) {
        return this.webClient.get().uri("/clientes/" + clienteId).retrieve().bodyToMono(Object.class).block();
    }

    public TicketSoporte guardarTicket(TicketSoporte t) { return ticketSoporteRepository.save(t); }
    public List<TicketSoporte> listarTickets() { return ticketSoporteRepository.findAll(); }
    public TicketSoporte obtenerTicket(Long id) { return ticketSoporteRepository.findById(id).orElse(null); }

    public Operador guardarOperador(Operador o) { return operadorRepository.save(o); }
    public List<Operador> listarOperadores() { return operadorRepository.findAll(); }
    public Operador obtenerOperador(Long id) { return operadorRepository.findById(id).orElse(null); }

    public HistorialEstado guardarHistorial(HistorialEstado h) { return historialEstadoRepository.save(h); }
    public List<HistorialEstado> listarHistoriales() { return historialEstadoRepository.findAll(); }
    public HistorialEstado obtenerHistorial(Long id) { return historialEstadoRepository.findById(id).orElse(null); }
}