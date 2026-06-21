package com.aseo.service_finanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_finanzas.model.CuentaBancaria;

public interface CuentaBancariaRepository extends JpaRepository<CuentaBancaria, Long> {
}