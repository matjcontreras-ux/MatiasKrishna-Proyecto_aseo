package com.aseo.service_finanzas.model;
import jakarta.persistence.*; 
import lombok.Data;
@Data 
@Entity
@Table(name = "gastos_local")

public class GastoLocal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String descripcion; // Ej: "Pago de luz", "Bolsas de basura para el local"
    private Double monto;
    public GastoLocal() {}
}