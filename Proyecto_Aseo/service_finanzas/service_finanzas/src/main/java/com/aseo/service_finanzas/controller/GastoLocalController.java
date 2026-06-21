package com.aseo.service_finanzas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_finanzas.model.GastoLocal;
import com.aseo.service_finanzas.service.FinanzasService;

@RestController 
@RequestMapping("/gastos-local")
public class GastoLocalController {

    @Autowired 
    private FinanzasService service;

    @PostMapping 
    public GastoLocal save(@RequestBody GastoLocal g) { 
        return service.saveGasto(g); 
    }

    @GetMapping 
    public List<GastoLocal> list() { 
        return service.listGastos(); 
    }
}