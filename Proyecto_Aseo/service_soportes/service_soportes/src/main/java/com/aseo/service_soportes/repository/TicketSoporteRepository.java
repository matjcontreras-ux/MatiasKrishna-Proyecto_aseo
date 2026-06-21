package com.aseo.service_soportes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aseo.service_soportes.model.TicketSoporte;
public interface TicketSoporteRepository extends JpaRepository<TicketSoporte, Long> {}