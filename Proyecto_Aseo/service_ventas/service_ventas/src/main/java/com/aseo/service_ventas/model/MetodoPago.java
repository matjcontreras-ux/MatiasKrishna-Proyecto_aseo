package com.aseo.service_ventas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "metodos_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String descripcion;
}