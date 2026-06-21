package com.aseo.service_despachos.model;
import jakarta.persistence.*;
import lombok.Data;
@Data @Entity @Table(name = "vehiculos")
public class Vehiculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patente;
    private String modelo;
    public Vehiculo() {}
}
