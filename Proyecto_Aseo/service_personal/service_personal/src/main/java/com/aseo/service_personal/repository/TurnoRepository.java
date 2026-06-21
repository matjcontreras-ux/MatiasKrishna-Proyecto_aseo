package com.aseo.service_personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_personal.model.Turno;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
}