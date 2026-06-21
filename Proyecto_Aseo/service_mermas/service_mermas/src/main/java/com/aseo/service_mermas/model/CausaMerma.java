package com.aseo.service_mermas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "causas_merma")
public class CausaMerma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion; // Ej: "Envase roto", "Vencido", "Derrame"

    public CausaMerma() {}
}