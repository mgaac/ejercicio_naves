package com.example.ejercicio_naves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio_naves.model.Lineas;

public interface LineasRepository extends JpaRepository<Lineas, String> {
}
