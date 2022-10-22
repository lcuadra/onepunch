package com.uam.onepunch.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "TipoCuenta")
public class TipoCuenta  {

    @Id
    @SequenceGenerator(name = "tipoCuenta_seq",
            sequenceName = "tipoCuenta_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "tipoCuenta_seq")

    private  Long id;
    private String tipoCuenta;
    private String estadoCuenta;

    @OneToMany  (mappedBy = "id_usuario", cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

    @OneToOne(mappedBy = "tipoCuenta")
    private Usuario usuario;

}
