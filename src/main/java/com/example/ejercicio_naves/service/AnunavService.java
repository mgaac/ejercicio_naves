package com.example.ejercicio_naves.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import lombok.RequiredArgsConstructor;

import com.example.ejercicio_naves.model.DfAnunav;
import com.example.ejercicio_naves.repository.DfAnunavRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AnunavService implements IAnunavService {

    private final DfAnunavRepository anunavRepository;

    public List<DfAnunav> getRecentAnnouncements() {
        return anunavRepository.findRecentAnnouncements(PageRequest.of(0, 20));
    }

    public DfAnunav findByUvi(String uvi) {
        return anunavRepository.findByUviWithDetails(uvi);
    }

    public List<DfAnunav> navesAtracarHoy() {
        LocalDateTime inicioDelDia = LocalDateTime.now().toLocalDate().atStartOfDay();
        LocalDateTime finDelDia = inicioDelDia.plusDays(1).minusNanos(1);
        return anunavRepository.findNavesAtracadasRango(inicioDelDia, finDelDia);
    }

    public List<DfAnunav> navesAtracarSemana() {
        LocalDateTime inicioDeSemana = LocalDateTime.now().toLocalDate().atStartOfDay();
        LocalDateTime finDeSemana= inicioDeSemana.plusDays(7).minusNanos(1);
        return anunavRepository.findNavesAtracadasRango(inicioDeSemana, finDeSemana);
    }

    public List<DfAnunav> navesAtracarRango(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        return anunavRepository.findNavesAtracadasRango(fechaInicio, fechaFin);
    }

    public List<DfAnunav> navesZarparHoy() {
        LocalDateTime inicioDelDia = LocalDateTime.now().toLocalDate().atStartOfDay();
        LocalDateTime finDelDia = inicioDelDia.plusDays(1).minusNanos(1);
        return anunavRepository.findNavesZarpadas(inicioDelDia, finDelDia);
    }

    public List<DfAnunav> navesZarparSemana() {
        LocalDateTime inicioDeSemana = LocalDateTime.now().toLocalDate().atStartOfDay();
        LocalDateTime finDeSemana = inicioDeSemana.plusDays(7).minusNanos(1);
        return anunavRepository.findNavesZarpadas(inicioDeSemana, finDeSemana);
    }

    public List<DfAnunav> navesZarparRango(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        return anunavRepository.findNavesZarpadas(fechaInicio, fechaFin);
    }

    public Boolean reportarZarpe(String uvi, LocalDateTime fechaZarpe) {
        var optionalAnunav = anunavRepository.findById(uvi);
        Boolean buqueAbierto = anunavRepository.isBuqueAbierto(uvi);
        
        if (optionalAnunav.isPresent() && buqueAbierto != null && buqueAbierto) {
    
            DfAnunav anunav = optionalAnunav.get();
    
            if (anunav.getFecha().isBefore(fechaZarpe) && 
                anunav.getFecZarpe() == null) {
    
                anunavRepository.notifyZarpeNave(uvi, fechaZarpe);
                return true;
            }
        }
        return false;
    }

    public Boolean reportarArribo(String uvi, LocalDateTime fechaArribo) {
        var optionalAnunav = anunavRepository.findById(uvi);
        Boolean buqueAbierto = anunavRepository.isBuqueAbierto(uvi);
        
        if (optionalAnunav.isEmpty() || buqueAbierto == null || !buqueAbierto) {
            return false;
        }
    
        DfAnunav anunav = optionalAnunav.get();
        if (anunav.getFecAtraq() == null) {
            anunavRepository.notifyArriboNave(uvi, fechaArribo);
            return true;
        }
    
        return false;
    }
}
