package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DFLINEAS")
public class Lineas {
    
    public Lineas() {
    }

    @Id
    @Column(name = "LINEA", length = 4)
    private String linea;

    @Column(name = "DESCRIPC", length = 50)
    private String descripc;

    @Column(name = "NAVIERO", precision = 10)
    private BigDecimal naviero;

    @Column(name = "LINDTAMA")
    private BigDecimal lindtama;

    @Column(name = "ACTIVO", length = 1)
    private String activo;

    @Column(name = "INDTRALLE", length = 1)
    private String indtralle;

    @Column(name = "INDTARVAC", length = 1)
    private String indtarvac;

    @Column(name = "INDPERPTO", length = 1)
    private String indperpto;

    @Column(name = "L_IND_FLETES", length = 1)
    private String lIndFletes;

    @Column(name = "L_IND_COMODATO", length = 1)
    private String lIndComodato;

    @Column(name = "LIN_CODIGO_ONL", length = 3)
    private String linCodigoOnl;

    @Column(name = "LIN_DESCRIPCION_CORTA", length = 20)
    private String linDescripcionCorta;

    @Column(name = "LIN_FECCREA")
    private Timestamp linFeccrea;

    @Column(name = "LIN_USRCREA", length = 18)
    private String linUsrcrea;

    @Column(name = "LIN_FECAUD")
    private Timestamp linFecaud;

    @Column(name = "LIN_USRAUD", length = 18)
    private String linUsraud;

    @Column(name = "LIN_SMDG", length = 5)
    private String linSmdg;

    @Column(name = "LIN_TOLERANCIA_VGM")
    private BigDecimal linToleranciaVgm;

    @Column(name = "LIN_PORCENTAJE_TOLERANCIA_VGM")
    private BigDecimal linPorcentajeToleranciaVgm;

} 