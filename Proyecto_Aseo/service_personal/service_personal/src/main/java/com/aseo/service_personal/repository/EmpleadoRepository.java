package com.aseo.service_personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_personal.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}