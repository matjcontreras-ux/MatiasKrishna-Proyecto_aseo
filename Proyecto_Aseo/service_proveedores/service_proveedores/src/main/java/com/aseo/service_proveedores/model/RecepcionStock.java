package com.aseo.service_proveedores.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "recepciones_stock")
public class RecepcionStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long ordenCompraId;
    private Long productoId;
    private Integer cantidadRecibida;
    private LocalDate fechaRecepcion;
}