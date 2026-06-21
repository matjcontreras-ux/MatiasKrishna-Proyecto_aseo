package com.aseo.service_mermas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mermas_productos")
public class Merma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productoId; // ID del producto que se rompió/perdió
    private Integer cantidadPerdida;
    private String fecha;

    public Merma() {}
}