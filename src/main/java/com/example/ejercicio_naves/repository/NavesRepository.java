package com.example.ejercicio_naves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ejercicio_naves.model.Naves;

import java.util.List;
import java.math.BigDecimal;

public interface NavesRepository extends JpaRepository<Naves, BigDecimal> {

  @Query(value="""
    SELECT *
      FROM SPRCDAT.DFNAVES n
    INNER JOIN SPRODAT.DFANUNAV A
        ON A.NAVE = N.NAVE
    WHERE A.FECATRAQ IS NULL
      AND A.ETA BETWEEN fechainicio AND fechafin
    ORDER BY A.ETA;
  """, nativeQuery = true)
  List<Naves> navesAnunciadas();
  
    @Query("""
      SELECT DISTINCT n
        FROM Naves n
        JOIN n.announcements a
        WHERE a.fecatraq IS NOT NULL
          AND a.feczarp IS NULL
        ORDER BY a.eta
    """)
    List<Naves> navesAtracadas();


}

