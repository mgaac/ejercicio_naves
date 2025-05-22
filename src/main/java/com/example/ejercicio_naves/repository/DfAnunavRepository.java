package com.example.ejercicio_naves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import com.example.ejercicio_naves.model.DfAnunav;

@Repository
public interface DfAnunavRepository extends JpaRepository<DfAnunav, String> {

    @Query("""
    SELECT a
      FROM DfAnunav a
      JOIN a.nave n
     WHERE a.fecAtraq IS NULL
       AND a.eta BETWEEN :fechaInicio AND :fechaFin
     ORDER BY a.eta
    """)
    List<DfAnunav> findNavesAnunciadas(
        @Param("fechaInicio") LocalDateTime fechaInicio,
        @Param("fechaFin"   ) LocalDateTime fechaFin
    );

    @Query("""
    SELECT a
      FROM DfAnunav a
      JOIN a.nave n
     WHERE a.fecAtraq IS NOT NULL
       AND a.fecZarpe IS NULL
     ORDER BY a.eta
    """)
    List<DfAnunav> findNavesAtracadas();

    @Query("""
        SELECT a
          FROM DfAnunav a
          JOIN a.nave n
         WHERE a.fecAtraq IS NOT NULL
           AND a.fecZarpe IS NULL
           AND a.eta BETWEEN :fechaInicio AND :fechaFin
        """)
    List<DfAnunav> findNavesAtracadasRango(
        @Param("fechaInicio") LocalDateTime fechaInicio,
        @Param("fechaFin"   ) LocalDateTime fechaFin
    );

    @Query("""
        SELECT a
          FROM DfAnunav a
          JOIN a.nave n
         WHERE a.fecAtraq  IS NOT NULL
           AND a.fecZarpe IS NOT NULL
           AND a.fecZarpe BETWEEN :fechaInicio AND :fechaFin
         ORDER BY a.fecAtraq
    """)
    List<DfAnunav> findNavesZarpadas(
        @Param("fechaInicio") LocalDateTime fechaInicio,
        @Param("fechaFin"   ) LocalDateTime fechaFin
    );

    @Modifying @Transactional
    @Query("UPDATE DfAnunav a SET a.fecAtraq = :fecha WHERE a.uvi = :uvi")
    int notifyArriboNave(
        @Param("uvi")   String uvi,
        @Param("fecha") LocalDateTime fecha
    );

    @Modifying @Transactional
    @Query("UPDATE DfAnunav a SET a.fecZarpe = :fecha WHERE a.uvi = :uvi")
    int notifyZarpeNave(
        @Param("uvi")   String uvi,
        @Param("fecha") LocalDateTime fecha
    );


    @Query("""
    SELECT CASE WHEN a.estoper = 'A' THEN true ELSE false END
      FROM DfAnunav a
     WHERE a.uvi = :uvi
    """)
    boolean isBuqueAbierto(@Param("uvi") String uvi);
} 