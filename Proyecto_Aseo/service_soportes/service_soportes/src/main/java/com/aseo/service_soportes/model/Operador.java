package com.aseo.service_soportes.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "operadores")
public class Operador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String area;
    public Operador() {}
}