package com.aseo.service_inventario.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bodegas")
@Data
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ubicacion;
}