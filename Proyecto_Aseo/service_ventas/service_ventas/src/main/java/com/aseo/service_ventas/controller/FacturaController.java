package com.aseo.service_ventas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_ventas.model.Factura;
import com.aseo.service_ventas.service.VentasService;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private VentasService ventasService;

    @PostMapping
    public Factura guardar(@RequestBody Factura f) { return ventasService.guardarFactura(f); }

    @GetMapping
    public List<Factura> listar() { return ventasService.listarFacturas(); }
}