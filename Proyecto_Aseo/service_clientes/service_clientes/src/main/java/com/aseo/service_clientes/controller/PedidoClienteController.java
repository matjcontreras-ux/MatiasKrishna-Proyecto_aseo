package com.aseo.service_clientes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_clientes.model.PedidoCliente;
import com.aseo.service_clientes.service.ClienteService;

@RestController
@RequestMapping("/pedidos")
public class PedidoClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public PedidoCliente guardar(@RequestBody PedidoCliente pedido) {
        return clienteService.guardarPedido(pedido);
    }

    @GetMapping
    public List<PedidoCliente> listar() {
        return clienteService.listarPedidos();
    }
}