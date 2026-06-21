package com.aseo.service_mermas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_mermas.model.Inspeccion;

public interface InspeccionRepository extends JpaRepository<Inspeccion, Long> {
}