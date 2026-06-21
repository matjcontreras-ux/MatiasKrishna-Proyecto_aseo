package com.aseo.service_proveedores.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String rut;
    private String nombreEmpresa;
    private String contacto;
    private String telefono;
}