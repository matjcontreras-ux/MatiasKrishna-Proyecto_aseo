package com.aseo.service_mermas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_mermas.model.Merma;
import com.aseo.service_mermas.service.MermaService;

@RestController
@RequestMapping("/mermas")
public class MermaController {

    @Autowired 
    private MermaService service;

    @PostMapping
    public Merma save(@RequestBody Merma m) { 
        return service.saveMerma(m); 
    }

    @GetMapping
    public List<Merma> list() { 
        return service.listMermas(); 
    }
}