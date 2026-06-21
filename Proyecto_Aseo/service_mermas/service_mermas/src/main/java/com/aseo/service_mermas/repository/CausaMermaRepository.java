package com.aseo.service_mermas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_mermas.model.CausaMerma;

public interface CausaMermaRepository extends JpaRepository<CausaMerma, Long> {
}