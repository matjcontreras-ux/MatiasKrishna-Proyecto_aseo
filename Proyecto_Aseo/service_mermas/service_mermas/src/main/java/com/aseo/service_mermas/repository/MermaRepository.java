package com.aseo.service_mermas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_mermas.model.Merma;

public interface MermaRepository extends JpaRepository<Merma, Long> {
}