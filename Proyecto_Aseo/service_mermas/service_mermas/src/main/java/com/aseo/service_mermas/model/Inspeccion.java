package com.aseo.service_mermas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inspecciones")
public class Inspeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String encargado;
    private String observacion;

    public Inspeccion() {}
}