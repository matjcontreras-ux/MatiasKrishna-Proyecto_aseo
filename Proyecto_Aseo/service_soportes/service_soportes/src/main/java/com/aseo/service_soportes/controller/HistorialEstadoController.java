package com.aseo.service_soportes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_soportes.model.HistorialEstado;
import com.aseo.service_soportes.service.SoporteService;

@RestController 
@RequestMapping("/historiales")
public class HistorialEstadoController {
   
    @Autowired private SoporteService service;
    
    @PostMapping public HistorialEstado save(@RequestBody HistorialEstado h) { return service.guardarHistorial(h); }
   
    @GetMapping public List<HistorialEstado> list() { return service.listarHistoriales(); }
    
    @GetMapping("/{id}") public HistorialEstado get(@PathVariable Long id) { return service.obtenerHistorial(id); }
}