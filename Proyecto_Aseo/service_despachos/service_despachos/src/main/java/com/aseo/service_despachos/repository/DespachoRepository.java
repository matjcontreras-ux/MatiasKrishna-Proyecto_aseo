package com.aseo.service_despachos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_despachos.model.Despacho;
public interface DespachoRepository extends JpaRepository<Despacho, Long> {}