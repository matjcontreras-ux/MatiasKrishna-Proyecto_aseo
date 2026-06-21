package com.aseo.service_personal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rut;
    private String nombre;
    private String apellido;
    private String cargo; // Ej: "Auxiliar", "Supervisor"
}