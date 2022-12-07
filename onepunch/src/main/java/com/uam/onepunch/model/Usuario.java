package com.uam.onepunch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "Usuario")
public class Usuario {
    private Boolean display;

    @Id
    @SequenceGenerator(name = "usuario_seq",
            sequenceName = "usuario_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "usuario_seq")

    private String pw;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;
}