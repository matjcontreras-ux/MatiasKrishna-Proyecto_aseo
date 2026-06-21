package com.aseo.service_finanzas.model;
import jakarta.persistence.*; 
import lombok.Data;
@Data 
@Entity 
@Table(name = "cuentas_bancarias")

public class CuentaBancaria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String banco;
    private Double saldoActual;
    public CuentaBancaria() {}
}