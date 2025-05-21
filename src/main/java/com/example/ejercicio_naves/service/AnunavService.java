package com.example.ejercicio_naves.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ejercicio_naves.model.Anunav;
import com.example.ejercicio_naves.repository.AnunavRepository;

@Service
@Transactional
public class AnunavService {

    private AnunavRepository anunavRepository; 

    @Autowired
    public AnunavService(AnunavRepository anunavRepository) {
        this.anunavRepository = anunavRepository;
    }

    public List<Anunav> findAll() {
        return anunavRepository.findAll();
    }
}
