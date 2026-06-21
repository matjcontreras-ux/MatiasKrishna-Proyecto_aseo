package com.aseo.service_personal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AsignacionTarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    private String area;

    
    private Long clienteId; 

    @Transient 
    private Object datosCliente;

    
    @ManyToOne
    private Empleado empleado;
    
    @ManyToOne
    private Turno turno;
}