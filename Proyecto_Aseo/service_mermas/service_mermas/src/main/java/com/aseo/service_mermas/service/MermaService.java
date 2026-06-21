package com.aseo.service_mermas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.aseo.service_mermas.model.*;
import com.aseo.service_mermas.repository.*;

@Service
public class MermaService {

    @Autowired private MermaRepository mermaRepository;
    @Autowired private CausaMermaRepository causaMermaRepository;
    @Autowired private InspeccionRepository inspeccionRepository;

    // Se conecta a Inventario (puerto 8082) para dar de baja el stock del producto dañado
    private final WebClient webClient = WebClient.builder().baseUrl("http://localhost:8082").build();

    public Object notificarBajaDeInventario(Long productoId) {
        return this.webClient.get().uri("/productos/" + productoId).retrieve().bodyToMono(Object.class).block();
    }

    public Merma saveMerma(Merma m) { return mermaRepository.save(m); }
    public List<Merma> listMermas() { return mermaRepository.findAll(); }

    public CausaMerma saveCausa(CausaMerma c) { return causaMermaRepository.save(c); }
    public List<CausaMerma> listCausas() { return causaMermaRepository.findAll(); }

    public Inspeccion saveInspeccion(Inspeccion i) { return inspeccionRepository.save(i); }
    public List<Inspeccion> listInspecciones() { return inspeccionRepository.findAll(); }
}