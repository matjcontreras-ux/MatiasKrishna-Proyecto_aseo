package com.aseo.service_mermas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_mermas.model.CausaMerma;
import com.aseo.service_mermas.service.MermaService;

@RestController
@RequestMapping("/causas-merma")
public class CausaMermaController {

    @Autowired 
    private MermaService service;

    @PostMapping
    public CausaMerma save(@RequestBody CausaMerma c) { 
        return service.saveCausa(c); 
    }

    @GetMapping
    public List<CausaMerma> list() { 
        return service.listCausas(); 
    }
}