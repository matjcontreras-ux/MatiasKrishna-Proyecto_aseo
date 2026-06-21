package com.aseo.service_proveedores.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_proveedores.model.RecepcionStock;
import com.aseo.service_proveedores.service.ProveedorService;

@RestController
@RequestMapping("/recepciones-stock")
public class RecepcionStockController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public RecepcionStock guardar(@RequestBody RecepcionStock r) { return proveedorService.guardarRecepcion(r); }

    @GetMapping
    public List<RecepcionStock> listar() { return proveedorService.listarRecepciones(); }
}