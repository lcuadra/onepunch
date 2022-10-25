package com.uam.onepunch.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @SequenceGenerator(name = "product_seq",
            sequenceName = "product_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_seq")
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;

    @OneToMany(mappedBy = "idCategoria")
    private List<Categoria> categorias;
}
