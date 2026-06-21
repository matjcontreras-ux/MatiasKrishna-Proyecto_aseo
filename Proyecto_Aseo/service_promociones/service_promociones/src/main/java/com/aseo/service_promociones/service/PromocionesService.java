package com.aseo.service_promociones.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.aseo.service_promociones.model.*;
import com.aseo.service_promociones.repository.*;

@Service
public class PromocionesService {
    @Autowired private PromocionRepository r1;
    @Autowired private CuponRepository r2;
    @Autowired private ClienteFrecuenteRepository r3;

    // Se conecta a Ventas para aplicar el descuento en la boleta
    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8085").build();

    public Object validarVentaParaDescuento(Long ventaId) {
        return this.webClient.get().uri("/ventas/" + ventaId).retrieve().bodyToMono(Object.class).block();
    }

    public Promocion savePromocion(Promocion p) { return r1.save(p); }
    public List<Promocion> listPromociones() { return r1.findAll(); }
    public Cupon saveCupon(Cupon c) { return r2.save(c); }
    public List<Cupon> listCupones() { return r2.findAll(); }
    public ClienteFrecuente saveClienteFrecuente(ClienteFrecuente cf) { return r3.save(cf); }
    public List<ClienteFrecuente> listClientesFrecuentes() { return r3.findAll(); }
}