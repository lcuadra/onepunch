package com.uam.onepunch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "ORDEN")
public class Orden {
    private Boolean display;

    @Id
    @SequenceGenerator(name = "orden_seq",
            sequenceName = "orden_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "orden_seq")
    private Long tipoPago;
    private Long total;
    private Date fecha;

    @OneToMany (mappedBy = "orden", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Pago> pagos;
}
