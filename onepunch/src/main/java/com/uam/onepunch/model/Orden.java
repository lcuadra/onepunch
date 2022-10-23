package com.uam.onepunch.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ORDEN")
public class Orden {
    @Id
    @SequenceGenerator(name = "orden_seq",
            sequenceName = "orden_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "orden_seq")
    private Long idcuenta;
    private Long idorden;
    private String estadoorden;
}
