package com.aseo.service_soportes.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "tickets_soporte")
public class TicketSoporte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalle;
    private String estado;
    private Long clienteId;
    public TicketSoporte() {}
}