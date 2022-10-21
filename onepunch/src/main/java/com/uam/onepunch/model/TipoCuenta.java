package com.uam.onepunch.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "TipoCuenta")
public class TipoCuenta  {

    @Id
    @SequenceGenerator(name = "TipoCuenta_seq",
            sequenceName = "TipoCuenta_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "TipoCuenta_seq")

    private  Long id;
    private String tipoCuenta;
    private String estadoCuenta;

    @OneToMany  (mappedBy = "id_usuario", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

    @OneToOne(mappedBy = "TipoCuenta")
    private Usuario usuario;

}
