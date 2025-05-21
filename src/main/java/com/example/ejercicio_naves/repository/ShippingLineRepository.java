package com.example.ejercicio_naves.repository;

import com.example.ejercicio_naves.model.ShippingLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingLineRepository extends JpaRepository<ShippingLine, String> {
} 