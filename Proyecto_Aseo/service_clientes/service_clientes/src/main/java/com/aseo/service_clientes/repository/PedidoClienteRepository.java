package com.aseo.service_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aseo.service_clientes.model.PedidoCliente;

@Repository
public interface PedidoClienteRepository extends JpaRepository<PedidoCliente, Long> {
}