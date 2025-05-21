package com.example.ejercicio_naves;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "DFNAVES")
public class Naves {
    @Id
    @Column(name = "NAVE", precision = 4)
    private BigDecimal nave;

    @Column(name = "DESCRIPC", length = 50)
    private String descripc;

    @Column(name = "TPONAVE")
    private BigDecimal tponave;

    @Column(name = "VIAJES", precision = 4)
    private BigDecimal viajes;

    @Column(name = "PAIS", length = 2)
    private String pais;

    @Column(name = "LINEA", length = 4)
    private String linea;

    @Column(name = "TONBRUTO", precision = 15, scale = 5)
    private BigDecimal tonbruto;

    @Column(name = "TONNETO", precision = 15, scale = 5)
    private BigDecimal tonneto;

    @Column(name = "ESLORA", precision = 7, scale = 2)
    private BigDecimal eslora;

    @Column(name = "MANGA", precision = 7, scale = 2)
    private BigDecimal manga;

    @Column(name = "CALADO", precision = 10, scale = 2)
    private BigDecimal calado;

    @Column(name = "NROBODEG", precision = 4)
    private BigDecimal nrobodeg;

    @Column(name = "NROGRUA", precision = 4)
    private BigDecimal nrogrua;

    @Column(name = "CAPTESU", precision = 4)
    private BigDecimal captesu;
x
    @Column(name = "CAPPASAJ", precision = 4)
    private BigDecimal cappasaj;

    @Column(name = "EDI", precision = 7)
    private BigDecimal edi;

    @Column(name = "NAVSUPER", length = 3)
    private String navsuper;

    @Column(name = "LLAMADA", length = 9)
    private String llamada;

    @Column(name = "CAPGRUA", precision = 15, scale = 5)
    private BigDecimal capgrua;

    @Column(name = "ARMADOR", length = 50)
    private String armador;

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

    @Column(name = "NOMCORTO", length = 20)
    private String nomcorto;

    // Getters and setters omitted for brevity
}
