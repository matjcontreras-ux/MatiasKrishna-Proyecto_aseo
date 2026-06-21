package com.aseo.service_despachos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_despachos.model.Vehiculo;
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {}