package com.aseo.service_mermas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_mermas.model.Inspeccion;
import com.aseo.service_mermas.service.MermaService;

@RestController
@RequestMapping("/inspecciones")
public class InspeccionController {

    @Autowired 
    private MermaService service;

    @PostMapping
    public Inspeccion save(@RequestBody Inspeccion i) { 
        return service.saveInspeccion(i); 
    }

    @GetMapping
    public List<Inspeccion> list() { 
        return service.listInspecciones(); 
    }
}