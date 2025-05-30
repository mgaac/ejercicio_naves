package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "DFNAVES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DfNave {

    @Id
    @Column(name = "NAVE", precision = 4)
    private BigDecimal id;

    @Column(name = "DESCRIPC", length = 50)
    private String descripc;

    @Column(name = "TPONAVE")
    private BigDecimal tpoNave;

    @Column(name = "VIAJES", precision = 4)
    private Integer viajes;

    @Column(name = "PAIS", length = 2)
    private String pais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LINEA")
    private DfLinea linea;

    @Column(name = "TONBRUTO", precision = 15, scale = 5)
    private BigDecimal tonBruto;

    @Column(name = "TONNETO", precision = 15, scale = 5)
    private BigDecimal tonNeto;

    @Column(name = "ESLORA", precision = 7, scale = 2)
    private BigDecimal eslora;

    @Column(name = "MANGA", precision = 7, scale = 2)
    private BigDecimal manga;

    @Column(name = "CALADO", precision = 10, scale = 2)
    private BigDecimal calado;

    @Column(name = "NROBODEG", precision = 4)
    private Integer nroBodeg;

    @Column(name = "NROGRUA", precision = 4)
    private Integer nroGrua;

    @Column(name = "CAPTEUS", precision = 4)
    private Integer capTeus;

    @Column(name = "CAPPASAJ", precision = 4)
    private Integer capPasaj;

    @Column(name = "EDI", precision = 7)
    private Integer edi;

    @Column(name = "NAVSUPER", length = 3)
    private String navSuper;

    @Column(name = "LLAMADA", length = 9)
    private String llamada;

    @Column(name = "CAPGRUA", precision = 15, scale = 5)
    private BigDecimal capGrua;

    @Column(name = "ARMADOR", length = 50)
    private String armador;

    @Column(name = "FECCREA")
    private LocalDateTime fecCrea;

    @Column(name = "USRCREA", length = 10)
    private String usrCrea;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "USUARIO", length = 10)
    private String usuario;

    @Column(name = "ACTIVO", length = 1)
    private String activo;

    @Column(name = "NOMCORTO", length = 20)
    private String nomCorto;

    @JsonIgnore
    @OneToMany(mappedBy = "nave")
    private List<DfAnunav> anuncios;

    public Boolean getActivoAsBoolean() {
        return activo != null && activo.equals("S");
    }
} 