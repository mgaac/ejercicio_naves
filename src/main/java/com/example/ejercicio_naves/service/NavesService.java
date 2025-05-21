package com.example.ejercicio_naves.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ejercicio_naves.model.Naves;
import com.example.ejercicio_naves.repository.NavesRepository;

import java.util.Date;

@Service
@Transactional
public class NavesService {

    private NavesRepository navesRepository;

    public NavesService(NavesRepository navesRepository) {
        this.navesRepository = navesRepository;
    }

    public List<Naves> findBy() {
        return navesRepository.findAll();
    }

    public List<Naves> atracarSemana() {
        return navesRepository.findAll();
    }

    public List<Naves> atracarRango(Date fechaInicio, Date fechaFin) {
        return navesRepository.findAll();
    }

    public List<Naves> navesZarpadasHoy() {
        return navesRepository.findAll();
    }

    public List<Naves> navesZarpadasSemana() {
        return navesRepository.findAll();
    }

    public List<Naves> navesZarpadasRango(Date fechaInicio, Date fechaFin) {
        return navesRepository.findAll();
    }
    
    
}
