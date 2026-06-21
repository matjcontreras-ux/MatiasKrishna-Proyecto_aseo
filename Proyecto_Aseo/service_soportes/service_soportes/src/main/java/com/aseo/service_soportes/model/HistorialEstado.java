package com.aseo.service_soportes.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "historial_estados")
public class HistorialEstado {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ticketId;
    private String estadoAnterior;
    private String estadoNuevo;
    public HistorialEstado() {}
}