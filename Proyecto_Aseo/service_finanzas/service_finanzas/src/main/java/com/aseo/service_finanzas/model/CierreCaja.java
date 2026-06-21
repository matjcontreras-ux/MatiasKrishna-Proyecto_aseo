package com.aseo.service_finanzas.model;

import jakarta.persistence.*; 
import lombok.Data;

@Data 

@Entity 

@Table(name = "cierres_caja")
public class CierreCaja {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String fecha;
    private Double totalIngresos;
    public CierreCaja() {}
}