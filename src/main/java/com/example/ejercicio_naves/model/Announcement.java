package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "DFANUNAV", schema = "SPRCDAT")
public class Announcement {
    @Id
    @Column(name = "UVI", nullable = false, length = 20)
    private String uvi;

    @Column(name = "ETA")
    private Timestamp eta;

    @Column(name = "ETD")
    private Timestamp etd;

    @Column(name = "FECATRAQ")
    private Timestamp actualArrival;

    @Column(name = "FECZARPE")
    private Timestamp actualDeparture;

    // ... other columns as needed ...

    @Column(name = "LIN_FECCREA")
    private Timestamp createdAt;

    @Column(name = "LIN_USRCREA")
    private String createdBy;

    @Column(name = "LIN_FECAUD")
    private Timestamp updatedAt;

    @Column(name = "LIN_USRAUD")
    private String updatedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAVE")
    private Vessel vessel;

    public Announcement() {}

    public Announcement(String uvi, Timestamp eta, Timestamp etd, Timestamp actualArrival, Timestamp actualDeparture, Timestamp createdAt, String createdBy, Timestamp updatedAt, String updatedBy, Vessel vessel) {
        this.uvi = uvi;
        this.eta = eta;
        this.etd = etd;
        this.actualArrival = actualArrival;
        this.actualDeparture = actualDeparture;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.vessel = vessel;
    }

    public String getUvi() { return uvi; }
    public void setUvi(String uvi) { this.uvi = uvi; }
    public Timestamp getEta() { return eta; }
    public void setEta(Timestamp eta) { this.eta = eta; }
    public Timestamp getEtd() { return etd; }
    public void setEtd(Timestamp etd) { this.etd = etd; }
    public Timestamp getActualArrival() { return actualArrival; }
    public void setActualArrival(Timestamp actualArrival) { this.actualArrival = actualArrival; }
    public Timestamp getActualDeparture() { return actualDeparture; }
    public void setActualDeparture(Timestamp actualDeparture) { this.actualDeparture = actualDeparture; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
    public String getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
    public Vessel getVessel() { return vessel; }
    public void setVessel(Vessel vessel) { this.vessel = vessel; }
} 