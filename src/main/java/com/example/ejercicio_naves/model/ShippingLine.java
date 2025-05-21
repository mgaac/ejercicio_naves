package com.example.ejercicio_naves.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "DFLINEAS", schema = "SPRCDAT")
public class ShippingLine {
    @Id
    @Column(name = "LINEA", nullable = false, length = 20)
    private String code;

    @Column(name = "DESCRIPC")
    private String name;

    @Column(name = "NAVIERO")
    private Long operatorCode;

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

    @OneToMany(mappedBy = "ownerLine", fetch = FetchType.LAZY)
    private List<Vessel> vessels;

    public ShippingLine() {}

    public ShippingLine(String code, String name, Long operatorCode, Boolean active, Timestamp createdAt, String createdBy, Timestamp updatedAt, String updatedBy, List<Vessel> vessels) {
        this.code = code;
        this.name = name;
        this.operatorCode = operatorCode;
        this.active = active;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.vessels = vessels;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getOperatorCode() { return operatorCode; }
    public void setOperatorCode(Long operatorCode) { this.operatorCode = operatorCode; }
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
    public List<Vessel> getVessels() { return vessels; }
    public void setVessels(List<Vessel> vessels) { this.vessels = vessels; }
} 