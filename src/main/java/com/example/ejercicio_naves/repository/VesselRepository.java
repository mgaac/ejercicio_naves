package com.example.ejercicio_naves.repository;

import com.example.ejercicio_naves.model.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;

public interface VesselRepository extends JpaRepository<Vessel, BigDecimal> {
} 