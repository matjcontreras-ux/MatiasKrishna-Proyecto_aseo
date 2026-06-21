package com.aseo.service_proveedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aseo.service_proveedores.model.RecepcionStock;

@Repository
public interface RecepcionStockRepository extends JpaRepository<RecepcionStock, Long> {
}
