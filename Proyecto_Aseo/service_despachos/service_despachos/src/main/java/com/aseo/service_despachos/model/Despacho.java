package com.aseo.service_despachos.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "despachos")
public class Despacho {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalle;
    private String estado;
    private Long clienteId;
    public Despacho() {}
}
