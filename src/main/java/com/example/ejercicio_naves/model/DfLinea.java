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
@Table(name = "DFLINEAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DfLinea {

    @Id
    @Column(name = "LINEA", length = 4)
    private String id;

    @Column(name = "DESCRIPC")
    private String descripc;

    @Column(name = "NAVIERO", precision = 10)
    private BigDecimal naviero;

    @Column(name = "LINDTAMA")
    private BigDecimal lindtama;

    @Column(name = "ACTIVO", length = 1)
    private String activo;

    @Column(name = "INDTARALLE", length = 1)
    private String indTarAlle;

    @Column(name = "LIN_CODIGO_ONL", length = 3)
    private String linCodigoOnl;

    @Column(name = "LIN_DESCRIPCION_CORTA", length = 20)
    private String linDescripcionCorta;

    @Column(name = "LIN_FECCREA")
    private LocalDateTime linFecCrea;

    @Column(name = "LIN_FECAUD")
    private LocalDateTime linFecAud;

    @Column(name = "LIN_USRCREA", length = 18)
    private String linUsrCrea;

    @Column(name = "LIN_USRAUD", length = 18)
    private String linUsrAud;

    @Column(name = "LIN_SMDG", length = 5)
    private String linSmdg;

    @Column(name = "LIN_TOLERANCIA_VGM")
    private BigDecimal linToleranciaVgm;

    @Column(name = "LIN_PORCENTAJE_TOLERANCIA_VGM")
    private BigDecimal linPorcentajeToleranciaVgm;

    @JsonIgnore
    @OneToMany(mappedBy = "linea")
    private List<DfNave> naves;

    @JsonIgnore
    @OneToMany(mappedBy = "linea")
    private List<DfAnunav> anuncios;

    // Custom methods that cannot be generated by Lombok
    public Boolean getActivoAsBoolean() {
        return activo != null && activo.equals("S");
    }
} 