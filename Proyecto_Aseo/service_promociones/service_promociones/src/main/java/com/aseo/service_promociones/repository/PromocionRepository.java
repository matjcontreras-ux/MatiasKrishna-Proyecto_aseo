package com.aseo.service_promociones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_promociones.model.Promocion;

public interface PromocionRepository extends JpaRepository<Promocion, Long> {}