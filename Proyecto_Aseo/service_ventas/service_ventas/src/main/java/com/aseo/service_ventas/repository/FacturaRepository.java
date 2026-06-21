package com.aseo.service_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aseo.service_ventas.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}