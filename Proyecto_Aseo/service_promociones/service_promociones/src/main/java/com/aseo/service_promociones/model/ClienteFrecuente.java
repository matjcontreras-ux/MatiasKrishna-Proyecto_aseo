package com.aseo.service_promociones.model;
import jakarta.persistence.*; 
import lombok.Data;
@Data 
@Entity
@Table(name = "clientes_frecuentes")

public class ClienteFrecuente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private Long clienteId;
    private Integer puntosAcumulados;
    public ClienteFrecuente() {}
}