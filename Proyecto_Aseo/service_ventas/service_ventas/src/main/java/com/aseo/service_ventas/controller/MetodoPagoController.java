package com.aseo.service_ventas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_ventas.model.MetodoPago;
import com.aseo.service_ventas.service.VentasService;

@RestController
@RequestMapping("/metodos-pago")
public class MetodoPagoController {

    @Autowired
    private VentasService ventasService;

    @PostMapping
    public MetodoPago guardar(@RequestBody MetodoPago m) { return ventasService.guardarMetodoPago(m); }

    @GetMapping
    public List<MetodoPago> listar() { return ventasService.listarMetodosPago(); }
}