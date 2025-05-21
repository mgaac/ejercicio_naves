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

    public Lineas(String linea, String descripc, BigDecimal naviero, BigDecimal lindtama, String activo, String indtralle, String indtarvac, String indperpto, String lIndFletes, String lIndComodato, String linCodigoOnl, String linDescripcionCorta, Timestamp linFeccrea, String linUsrcrea, Timestamp linFecaud, String linUsraud, String linSmdg, BigDecimal linToleranciaVgm, BigDecimal linPorcentajeToleranciaVgm) {
        this.linea = linea;
        this.descripc = descripc;
        this.naviero = naviero;
        this.lindtama = lindtama;
        this.activo = activo;
        this.indtralle = indtralle;
        this.indtarvac = indtarvac;
        this.indperpto = indperpto;
        this.lIndFletes = lIndFletes;
        this.lIndComodato = lIndComodato;
        this.linCodigoOnl = linCodigoOnl;
        this.linDescripcionCorta = linDescripcionCorta;
        this.linFeccrea = linFeccrea;
        this.linUsrcrea = linUsrcrea;
        this.linFecaud = linFecaud;
        this.linUsraud = linUsraud;
        this.linSmdg = linSmdg;
        this.linToleranciaVgm = linToleranciaVgm;
        this.linPorcentajeToleranciaVgm = linPorcentajeToleranciaVgm;
    }

    public String getLinea() { return linea; }
    public void setLinea(String linea) { this.linea = linea; }
    public String getDescripc() { return descripc; }
    public void setDescripc(String descripc) { this.descripc = descripc; }
    public BigDecimal getNaviero() { return naviero; }
    public void setNaviero(BigDecimal naviero) { this.naviero = naviero; }
    public BigDecimal getLindtama() { return lindtama; }
    public void setLindtama(BigDecimal lindtama) { this.lindtama = lindtama; }
    public String getActivo() { return activo; }
    public void setActivo(String activo) { this.activo = activo; }
    public String getIndtralle() { return indtralle; }
    public void setIndtralle(String indtralle) { this.indtralle = indtralle; }
    public String getIndtarvac() { return indtarvac; }
    public void setIndtarvac(String indtarvac) { this.indtarvac = indtarvac; }
    public String getIndperpto() { return indperpto; }
    public void setIndperpto(String indperpto) { this.indperpto = indperpto; }
    public String getLIndFletes() { return lIndFletes; }
    public void setLIndFletes(String lIndFletes) { this.lIndFletes = lIndFletes; }
    public String getLIndComodato() { return lIndComodato; }
    public void setLIndComodato(String lIndComodato) { this.lIndComodato = lIndComodato; }
    public String getLinCodigoOnl() { return linCodigoOnl; }
    public void setLinCodigoOnl(String linCodigoOnl) { this.linCodigoOnl = linCodigoOnl; }
    public String getLinDescripcionCorta() { return linDescripcionCorta; }
    public void setLinDescripcionCorta(String linDescripcionCorta) { this.linDescripcionCorta = linDescripcionCorta; }
    public Timestamp getLinFeccrea() { return linFeccrea; }
    public void setLinFeccrea(Timestamp linFeccrea) { this.linFeccrea = linFeccrea; }
    public String getLinUsrcrea() { return linUsrcrea; }
    public void setLinUsrcrea(String linUsrcrea) { this.linUsrcrea = linUsrcrea; }
    public Timestamp getLinFecaud() { return linFecaud; }
    public void setLinFecaud(Timestamp linFecaud) { this.linFecaud = linFecaud; }
    public String getLinUsraud() { return linUsraud; }
    public void setLinUsraud(String linUsraud) { this.linUsraud = linUsraud; }
    public String getLinSmdg() { return linSmdg; }
    public void setLinSmdg(String linSmdg) { this.linSmdg = linSmdg; }
    public BigDecimal getLinToleranciaVgm() { return linToleranciaVgm; }
    public void setLinToleranciaVgm(BigDecimal linToleranciaVgm) { this.linToleranciaVgm = linToleranciaVgm; }
    public BigDecimal getLinPorcentajeToleranciaVgm() { return linPorcentajeToleranciaVgm; }
    public void setLinPorcentajeToleranciaVgm(BigDecimal linPorcentajeToleranciaVgm) { this.linPorcentajeToleranciaVgm = linPorcentajeToleranciaVgm; }
} 