package com.aseo.service_promociones.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_promociones.model.ClienteFrecuente;
import com.aseo.service_promociones.service.PromocionesService;

@RestController 
@RequestMapping("/clientes-frecuentes")

public class ClienteFrecuenteController {
    @Autowired private PromocionesService service;
    @PostMapping public ClienteFrecuente save(@RequestBody ClienteFrecuente cf) { return service.saveClienteFrecuente(cf); }
    @GetMapping public List<ClienteFrecuente> list() { return service.listClientesFrecuentes(); }
}