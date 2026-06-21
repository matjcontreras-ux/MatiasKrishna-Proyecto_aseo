package com.aseo.service_finanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_finanzas.model.GastoLocal;

public interface GastoLocalRepository extends JpaRepository<GastoLocal, Long> {
}