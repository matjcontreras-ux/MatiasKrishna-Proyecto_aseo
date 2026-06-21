package com.aseo.service_promociones.model;
import jakarta.persistence.*; 
import lombok.Data;
@Data 
@Entity 
@Table(name = "promociones")

public class Promocion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String nombrePromocion; // Ej: "Mes de la limpieza"
    private Double porcentajeDescuento;
    private String fechaVencimiento;
    public Promocion() {}
}