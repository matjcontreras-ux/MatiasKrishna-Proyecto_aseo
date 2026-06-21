package com.aseo.service_personal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreTurno; // Ej: "Mañana", "Noche"
    private String horaInicio;  // Ej: "08:00"
    private String horaFin;     // Ej: "16:00"
}