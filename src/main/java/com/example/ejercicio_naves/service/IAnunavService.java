package com.example.ejercicio_naves.service;

import com.example.ejercicio_naves.model.DfAnunav;
import java.time.LocalDateTime;
import java.util.List;

public interface IAnunavService {
    
    List<DfAnunav> getRecentAnnouncements();
    
    DfAnunav findByUvi(String uvi);
    
    List<DfAnunav> navesAtracarHoy();
    
    List<DfAnunav> navesAtracarSemana();
    
    List<DfAnunav> navesAtracarRango(LocalDateTime fechaInicio, LocalDateTime fechaFin);
    
    List<DfAnunav> navesZarparHoy();
    
    List<DfAnunav> navesZarparSemana();
    
    List<DfAnunav> navesZarparRango(LocalDateTime fechaInicio, LocalDateTime fechaFin);
    
    Boolean reportarZarpe(String uvi, LocalDateTime fechaZarpe);
    
    Boolean reportarArribo(String uvi, LocalDateTime fechaArribo);
} 