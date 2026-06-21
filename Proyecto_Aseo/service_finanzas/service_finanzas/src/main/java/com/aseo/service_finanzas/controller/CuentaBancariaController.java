package com.aseo.service_finanzas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_finanzas.model.CuentaBancaria;
import com.aseo.service_finanzas.service.FinanzasService;

@RestController 
@RequestMapping("/cuentas-bancarias")
public class CuentaBancariaController {

    @Autowired 
    private FinanzasService service;

    @PostMapping 
    public CuentaBancaria save(@RequestBody CuentaBancaria cb) { 
        return service.saveCuenta(cb); 
    }

    @GetMapping 
    public List<CuentaBancaria> list() { 
        return service.listCuentas(); 
    }
}