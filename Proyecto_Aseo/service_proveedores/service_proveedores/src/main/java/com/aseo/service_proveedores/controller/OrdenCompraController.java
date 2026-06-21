package com.aseo.service_proveedores.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_proveedores.model.OrdenCompra;
import com.aseo.service_proveedores.service.ProveedorService;

@RestController
@RequestMapping("/ordenes-compra")
public class OrdenCompraController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public OrdenCompra guardar(@RequestBody OrdenCompra o) { return proveedorService.guardarOrden(o); }

    @GetMapping
    public List<OrdenCompra> listar() { return proveedorService.listarOrdenes(); }
}