package com.aseo.service_soportes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_soportes.model.Operador;
import com.aseo.service_soportes.service.SoporteService;

@RestController 
@RequestMapping("/operadores")
public class OperadorController {
    
    @Autowired private SoporteService service;
    
    @PostMapping public Operador save(@RequestBody Operador o) { return service.guardarOperador(o); }
    
    @GetMapping public List<Operador> list() { return service.listarOperadores(); }
    
    @GetMapping("/{id}") public Operador get(@PathVariable Long id) { return service.obtenerOperador(id); }
}