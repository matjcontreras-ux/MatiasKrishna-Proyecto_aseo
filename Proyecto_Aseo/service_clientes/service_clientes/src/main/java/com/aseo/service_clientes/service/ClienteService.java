package com.aseo.service_clientes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aseo.service_clientes.model.Cliente;
import com.aseo.service_clientes.model.PedidoCliente;
import com.aseo.service_clientes.model.DetallePedido;
import com.aseo.service_clientes.repository.ClienteRepository;
import com.aseo.service_clientes.repository.PedidoClienteRepository;
import com.aseo.service_clientes.repository.DetallePedidoRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obtenerClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }


    public PedidoCliente guardarPedido(PedidoCliente pedido) {
        return pedidoClienteRepository.save(pedido);
    }

    public List<PedidoCliente> listarPedidos() {
        return pedidoClienteRepository.findAll();
    }

    
    public DetallePedido guardarDetalle(DetallePedido detalle) {
        return detallePedidoRepository.save(detalle);
    }

    public List<DetallePedido> listarDetalles() {
        return detallePedidoRepository.findAll();
    }
}
