package com.example.ejercicio_naves.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EjercicioNavesService {
    
    private NavesService navesService;
    private LineasService lineasService;
    private AnunavService anunavService;

    public EjercicioNavesService(NavesService navesService, LineasService lineasService, AnunavService anunavService) {
        this.navesService = navesService;
        this.lineasService = lineasService;
        this.anunavService = anunavService;
    }
}
