package edu.co.icesi.banner.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Producto producto;


    private int cantidad;

    // Constructor, getters y setters
}

