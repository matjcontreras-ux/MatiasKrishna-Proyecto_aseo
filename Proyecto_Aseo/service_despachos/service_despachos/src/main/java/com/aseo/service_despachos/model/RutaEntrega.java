package com.aseo.service_despachos.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "rutas_entrega")
public class RutaEntrega {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origen;
    private String destino;
    public RutaEntrega() {}
}
