package com.aseo.service_ventas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_ventas.model.Transaccion;
import com.aseo.service_ventas.service.VentasService;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    @Autowired
    private VentasService ventasService;

    @PostMapping
    public Transaccion guardar(@RequestBody Transaccion t) { return ventasService.guardarTransaccion(t); }

    @GetMapping
    public List<Transaccion> listar() { return ventasService.listarTransacciones(); }
}