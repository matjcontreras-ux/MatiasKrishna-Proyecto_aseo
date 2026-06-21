package com.aseo.service_clientes.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalles_pedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long pedidoId; 
    private Long productoId; 
    private Integer cantidad;
    private Double precioUnitario;
}