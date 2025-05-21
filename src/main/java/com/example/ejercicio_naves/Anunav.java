package com.example.ejercicio_naves;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DFANUNAV")
public class Anunav {
    @Id
    @Column(name = "UVI", length = 5)
    private String uvi;

    @Column(name = "NAVE", precision = 4)
    private BigDecimal nave;

    @Column(name = "VIAJES", precision = 4)
    private BigDecimal viajes;

    @Column(name = "ETA")
    private Timestamp eta;

    @Column(name = "ETD")
    private Timestamp etd;

    @Column(name = "FECATRAQ")
    private Timestamp fecatraq;

    @Column(name = "FECZARPE")
    private Timestamp feczarpe;

    @Column(name = "NAVIERO", precision = 10)
    private BigDecimal naviero;

    @Column(name = "LINEA", length = 4)
    private String linea;

    @Column(name = "POOL", length = 4)
    private String pool;

    @Column(name = "TPONAVE", precision = 4)
    private BigDecimal tponave;

    @Column(name = "RUTAM", length = 4)
    private String rutam;

    @Column(name = "PTOANTER", length = 5)
    private String ptoanter;

    @Column(name = "PTOSIGUI", length = 5)
    private String ptosigui;

    @Column(name = "VIAJEENT", length = 20)
    private String viajeent;

    @Column(name = "VIAJESAL", length = 20)
    private String viajesal;

    @Column(name = "CONFEREN", length = 15)
    private String conferen;

    @Column(name = "ESTANUN", length = 1)
    private String estanun;

    @Column(name = "ESTMAR")
    private BigDecimal estmar;

    @Column(name = "NUMPAS", precision = 4)
    private BigDecimal numpas;

    @Column(name = "INDESTADIS", length = 1)
    private String indestadis;

    @Column(name = "INDDEPOSIT", length = 1)
    private String inddeposit;

    @Column(name = "TPOIMULAJ")
    private BigDecimal tpoimulaj;

    @Column(name = "ESTOPER", length = 1)
    private String estoper;

    @Column(name = "FECCIERRE")
    private Timestamp feccierre;

    @Column(name = "INDICADE", length = 1)
    private String indicade;

    @Column(name = "REGCAP", length = 32)
    private String regcap;

    @Column(name = "FECRCAP")
    private Timestamp fecrcap;

    @Column(name = "FECCEAUD")
    private Timestamp fecceaud;

    @Column(name = "TPOTRAF")
    private BigDecimal tpotraf;

    @Column(name = "INDDESCAR", length = 1)
    private String inddescar;

    @Column(name = "INDCARGUE", length = 1)
    private String indcargue;

    @Column(name = "INDTRANSAC", length = 1)
    private String indtransac;

    @Column(name = "CALADPROA", precision = 10, scale = 2)
    private BigDecimal caladproa;

    @Column(name = "CALADPOPA", precision = 10, scale = 2)
    private BigDecimal caladpopa;

    @Column(name = "SITSOL", length = 3)
    private String sitsol;

    @Column(name = "SITASG", length = 3)
    private String sitasg;

    @Column(name = "STACT", length = 3)
    private String stact;

    @Column(name = "MODATRSOL", precision = 4)
    private BigDecimal modatrsol;

    @Column(name = "MODATRASG", precision = 4)
    private BigDecimal modatrasg;

    @Column(name = "INDCARGOS", length = 1)
    private String indcargos;

    @Column(name = "INDFACTURA", length = 1)
    private String indfactura;

    @Column(name = "CBF")
    private Timestamp cbf;

    @Column(name = "LCO")
    private Timestamp lco;

    @Column(name = "CCO")
    private Timestamp cco;

    @Column(name = "FECCREA")
    private Timestamp feccrea;

    @Column(name = "USRCREA", length = 10)
    private String usrcrea;

    @Column(name = "FECHA")
    private Timestamp fecha;

    @Column(name = "USUARIO", length = 10)
    private String usuario;

    @Column(name = "ACTIVO", length = 1)
    private String activo;

    @Column(name = "OBSERVA", columnDefinition = "CLOB")
    private String observa;

    @Column(name = "AN_ENVIO_BAPILE_ATRAQUE", length = 1)
    private String anEnvioBapileAtraque;

    @Column(name = "AN_ENVIO_BAPILE_ZARPE", length = 1)
    private String anEnvioBapileZarpe;

    @Column(name = "AN_FECHA_ENVIO_BAPILE_ATRAQUE")
    private Timestamp anFechaEnvioBapileAtraque;

    @Column(name = "AN_FECHA_ENVIO_BAPILE_ZARPE")
    private Timestamp anFechaEnvioBapileZarpe;

    @Column(name = "AN_TEUS_ATRAQUE")
    private Integer anTeusAtraque;

    @Column(name = "AN_TEUS_ZARPE")
    private Integer anTeusZarpe;

    @Column(name = "AN_RUMBO", length = 50)
    private String anRumbo;

    @Column(name = "AN_ETA_SPARCS")
    private Timestamp anEtaSparcs;
} 