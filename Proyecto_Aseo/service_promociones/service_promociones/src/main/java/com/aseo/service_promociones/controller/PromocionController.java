package com.aseo.service_promociones.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_promociones.model.Promocion;
import com.aseo.service_promociones.service.PromocionesService;

@RestController 
@RequestMapping("/promociones")

public class PromocionController {
    @Autowired private PromocionesService service;
    @PostMapping public Promocion save(@RequestBody Promocion p) { return service.savePromocion(p); }
    @GetMapping public List<Promocion> list() { return service.listPromociones(); }
}