package com.uam.onepunch.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "PAGO")
public class Pago {

    @Id
    @SequenceGenerator(name = "Pago_seq",
            sequenceName = "Pago_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Pago_seq")

    private Long idPago;
    private Long idOrden;
    private Long cvv;
    private String exp_month;
    private String exp_year;
    private Long numtarjeta;


}




