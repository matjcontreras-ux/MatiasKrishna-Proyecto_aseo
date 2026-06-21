package com.aseo.service_proveedores.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ordenes_compra")
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long proveedorId;
    private LocalDate fechaOrden;
    private Double totalInversion;
    private String estado;
}