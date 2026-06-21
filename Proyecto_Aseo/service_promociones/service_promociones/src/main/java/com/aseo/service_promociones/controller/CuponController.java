package com.aseo.service_promociones.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_promociones.model.Cupon;
import com.aseo.service_promociones.service.PromocionesService;

@RestController 
@RequestMapping("/cupones")

public class CuponController {
    @Autowired private PromocionesService service;
    @PostMapping public Cupon save(@RequestBody Cupon c) { return service.saveCupon(c); }
    @GetMapping public List<Cupon> list() { return service.listCupones(); }
}