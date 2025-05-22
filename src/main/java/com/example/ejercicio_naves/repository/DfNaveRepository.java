package com.example.ejercicio_naves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio_naves.model.DfNave;

import java.math.BigDecimal;

@Repository
public interface DfNaveRepository extends JpaRepository<DfNave, BigDecimal> {
    // Custom queries can be added here if needed
} 