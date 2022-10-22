package com.uam.onepunch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "Usuario")
public class Usuario {
    @Id
    @SequenceGenerator(name = "usuario_seq",
            sequenceName = "usuario_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "usuario_seq")

    private Long id_usuario;
    private String nombreUsuario;
    private String pwUsuario;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    @JsonProperty ( access = JsonProperty.Access.WRITE_ONLY)
    private Persona persona;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_tipoCuenta", referencedColumnName = "id")
//    private TipoCuenta tipoCuenta;

}