package com.aseo.service_ventas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long facturaId;
    private Long metodoPagoId;
    private Double monto;
    private LocalDateTime fechaTransaccion;
    private String estado;
}