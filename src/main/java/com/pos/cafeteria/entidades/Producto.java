package com.pos.cafeteria.entidades;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonNaming
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 60)
    private String nombre;

    @Column(name = "valor_venta")
    private Double valorVenta;

    @Column(name = "estado")
    private Integer estado;

}
