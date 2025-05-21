package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "DFNAVES", schema = "SPRCDAT")
public class Vessel {
    @Id
    @Column(name = "NAVE", nullable = false)
    private BigDecimal id;

    @Column(name = "DESCRIPC")
    private String description;

    @Column(name = "TPONAVE")
    private Integer vesselType;

    @Column(name = "PAIS")
    private String flagCountry;

    @Column(name = "TONBRUTO")
    private BigDecimal grossTonnage;

    @Column(name = "TONNETO")
    private BigDecimal netTonnage;

    @Column(name = "ESLORA")
    private BigDecimal length;

    @Column(name = "MANGA")
    private BigDecimal beam;

    @Column(name = "CALADO")
    private BigDecimal draft;

    @Column(name = "ACTIVO")
    private Boolean active;

    @Column(name = "LIN_FECCREA")
    private Timestamp createdAt;

    @Column(name = "LIN_USRCREA")
    private String createdBy;

    @Column(name = "LIN_FECAUD")
    private Timestamp updatedAt;

    @Column(name = "LIN_USRAUD")
    private String updatedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LINEA")
    private ShippingLine ownerLine;

    @OneToMany(mappedBy = "vessel", fetch = FetchType.LAZY)
    private List<Anunav> announcements;

    public Vessel() {}

    public Vessel(BigDecimal id, String description, Integer vesselType, String flagCountry, BigDecimal grossTonnage, BigDecimal netTonnage, BigDecimal length, BigDecimal beam, BigDecimal draft, Boolean active, Timestamp createdAt, String createdBy, Timestamp updatedAt, String updatedBy, ShippingLine ownerLine, List<Anunav> announcements) {
        this.id = id;
        this.description = description;
        this.vesselType = vesselType;
        this.flagCountry = flagCountry;
        this.grossTonnage = grossTonnage;
        this.netTonnage = netTonnage;
        this.length = length;
        this.beam = beam;
        this.draft = draft;
        this.active = active;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.ownerLine = ownerLine;
        this.announcements = announcements;
    }

    public BigDecimal getId() { return id; }
    public void setId(BigDecimal id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getVesselType() { return vesselType; }
    public void setVesselType(Integer vesselType) { this.vesselType = vesselType; }
    public String getFlagCountry() { return flagCountry; }
    public void setFlagCountry(String flagCountry) { this.flagCountry = flagCountry; }
    public BigDecimal getGrossTonnage() { return grossTonnage; }
    public void setGrossTonnage(BigDecimal grossTonnage) { this.grossTonnage = grossTonnage; }
    public BigDecimal getNetTonnage() { return netTonnage; }
    public void setNetTonnage(BigDecimal netTonnage) { this.netTonnage = netTonnage; }
    public BigDecimal getLength() { return length; }
    public void setLength(BigDecimal length) { this.length = length; }
    public BigDecimal getBeam() { return beam; }
    public void setBeam(BigDecimal beam) { this.beam = beam; }
    public BigDecimal getDraft() { return draft; }
    public void setDraft(BigDecimal draft) { this.draft = draft; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
    public String getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
    public ShippingLine getOwnerLine() { return ownerLine; }
    public void setOwnerLine(ShippingLine ownerLine) { this.ownerLine = ownerLine; }
    public List<Anunav> getAnnouncements() { return announcements; }
    public void setAnnouncements(List<Anunav> announcements) { this.announcements = announcements; }
} 