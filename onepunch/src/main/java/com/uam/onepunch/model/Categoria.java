package com.uam.onepunch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @SequenceGenerator(name = "Categoria_seq",
            sequenceName = "Categoria_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Categoria_seq")

    private Long idCategoria;
    private String categoria;
    private String descripcion;

    private Boolean display;
}
