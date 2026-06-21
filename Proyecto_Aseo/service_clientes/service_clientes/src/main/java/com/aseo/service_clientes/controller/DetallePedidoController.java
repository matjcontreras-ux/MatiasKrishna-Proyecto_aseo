package com.aseo.service_clientes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_clientes.model.DetallePedido;
import com.aseo.service_clientes.service.ClienteService;

@RestController
@RequestMapping("/detalles-pedido")
public class DetallePedidoController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public DetallePedido guardar(@RequestBody DetallePedido detalle) {
        return clienteService.guardarDetalle(detalle);
    }

    @GetMapping
    public List<DetallePedido> listar() {
        return clienteService.listarDetalles();
    }
}