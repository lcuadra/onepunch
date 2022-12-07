package com.uam.onepunch.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "PAGO")
public class Pago {
    private Boolean display;


    @Id
    @SequenceGenerator(name = "Pago_seq",
            sequenceName = "Pago_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Pago_seq")

    private Long idProducto;
    private Long cantidad;
    private Date diaEntrega;
    private Date fechaPago;
    private double precio;
    private double subtotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Orden orden;

}




