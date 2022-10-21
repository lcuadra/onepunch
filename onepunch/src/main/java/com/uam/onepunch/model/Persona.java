package com.uam.onepunch.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Persona")

public class Persona {
    @Id
    @SequenceGenerator(name = "persona_seq",
            sequenceName = "persona_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "persona_seq")

    private Long id;
    private String apellidos;
    private String direccion;
    private String email;
    private String fechaNacimiento;
    private String nombres;
    private  String telefono;

    @OneToMany (mappedBy = "idPersona", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

}
