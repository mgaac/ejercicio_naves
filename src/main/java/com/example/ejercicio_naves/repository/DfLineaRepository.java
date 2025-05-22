package com.example.ejercicio_naves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio_naves.model.DfLinea;

@Repository
public interface DfLineaRepository extends JpaRepository<DfLinea, String> {
    // Custom queries can be added here if needed
} 