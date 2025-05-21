package com.example.ejercicio_naves.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ejercicio_naves.model.Lineas;
import com.example.ejercicio_naves.repository.LineasRepository;

@Service
@Transactional
public class LineasService {

    private LineasRepository lineasRepository;

    @Autowired
    public LineasService(LineasRepository lineasRepository) {
        this.lineasRepository = lineasRepository;
    }

    public List<Lineas> findAll() {
        return lineasRepository.findAll();
    }
}
