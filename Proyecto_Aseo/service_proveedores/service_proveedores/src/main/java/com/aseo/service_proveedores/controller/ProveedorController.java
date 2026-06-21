package com.aseo.service_proveedores.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_proveedores.model.Proveedor;
import com.aseo.service_proveedores.service.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor p) { return proveedorService.guardarProveedor(p); }

    @GetMapping
    public List<Proveedor> listar() { return proveedorService.listarProveedores(); }
}