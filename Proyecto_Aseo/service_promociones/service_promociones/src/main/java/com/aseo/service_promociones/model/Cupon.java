package com.aseo.service_promociones.model;
import jakarta.persistence.*; 
import lombok.Data;
@Data 
@Entity 
@Table(name = "cupones")

public class Cupon {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String codigo; // Ej: "ASEO2026"
    private Long promocionId;
    private Boolean estaUsado;
    public Cupon() {}
}