package com.example.ejercicio_naves.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import com.example.ejercicio_naves.model.DfAnunav;
import com.example.ejercicio_naves.service.AnunavService;
// import com.example.ejercicio_naves.service.LineasService;
// import com.example.ejercicio_naves.service.NavesService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EjercicioNavesController {

    // private final NavesService navesService;
    // private final LineasService lineasService;
    private final AnunavService anunavService;

    @GetMapping("/naves/anunciadas/atracar/hoy")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasAtracarHoy() {
        return ResponseEntity.ok(anunavService.navesAtracarHoy());
    }

    @GetMapping("/naves/anunciadas/atracar/semana")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasAtracarSemana() {
        return ResponseEntity.ok(anunavService.navesAtracarSemana());
    }

    @GetMapping("/naves/anunciadas/atracar/rango")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasAtracarRango(@RequestParam LocalDateTime fechaInicio, @RequestParam LocalDateTime fechaFin) {
        return ResponseEntity.ok(anunavService.navesAtracarRango(fechaInicio, fechaFin));
    }

    @GetMapping("/naves/anunciadas/zarpar/hoy")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasZarparHoy() {
        return ResponseEntity.ok(anunavService.navesZarparHoy());
    }

    @GetMapping("/naves/anunciadas/zarpar/semana")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasZarparSemana() {
        return ResponseEntity.ok(anunavService.navesZarparSemana());
    }

    @GetMapping("/naves/anunciadas/zarpar/rango")
    public ResponseEntity<List<DfAnunav>> getNavesAnunciadasZarparRango(@RequestParam LocalDateTime fechaInicio, @RequestParam LocalDateTime fechaFin) {
        return ResponseEntity.ok(anunavService.navesZarparRango(fechaInicio, fechaFin));
    }

    @GetMapping("/naves/reportar/zarpe")
    public ResponseEntity<Boolean> reportarZarpe(@RequestParam String uvi, @RequestParam LocalDateTime fechaZarpe) {
        return ResponseEntity.ok(anunavService.reportarZarpe(uvi, fechaZarpe));
    }

    @GetMapping("/naves/reportar/arribo")
    public ResponseEntity<Boolean> reportarArribo(@RequestParam String uvi, @RequestParam LocalDateTime fechaArribo) {
        return ResponseEntity.ok(anunavService.reportarArribo(uvi, fechaArribo));
    }
}
