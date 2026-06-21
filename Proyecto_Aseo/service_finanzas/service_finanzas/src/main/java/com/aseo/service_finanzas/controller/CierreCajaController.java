package com.aseo.service_finanzas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_finanzas.model.CierreCaja;
import com.aseo.service_finanzas.service.FinanzasService;

@RestController 
@RequestMapping("/cierres-caja")
public class CierreCajaController {

    @Autowired 
    private FinanzasService service;

    @PostMapping 
    public CierreCaja save(@RequestBody CierreCaja c) { 
        return service.saveCierre(c); 
    }

    @GetMapping 
    public List<CierreCaja> list() { 
        return service.listCierres(); 
    }
}