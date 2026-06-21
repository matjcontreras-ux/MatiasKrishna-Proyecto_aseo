package com.aseo.service_inventario.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_inventario.model.Bodega;
import com.aseo.service_inventario.repository.BodegaRepository;

@RestController
@RequestMapping("/api/bodegas")
public class BodegaController {

    @Autowired
    private BodegaRepository bodegaRepository;

    @GetMapping
    public List<Bodega> listar() {
        return bodegaRepository.findAll();
    }

    @PostMapping
    public Bodega crear(@RequestBody Bodega bodega) {
        return bodegaRepository.save(bodega);
    }
}