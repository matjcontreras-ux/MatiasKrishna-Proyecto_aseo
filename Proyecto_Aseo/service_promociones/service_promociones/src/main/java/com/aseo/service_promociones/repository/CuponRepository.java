package com.aseo.service_promociones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_promociones.model.Cupon;

public interface CuponRepository extends JpaRepository<Cupon, Long> {}