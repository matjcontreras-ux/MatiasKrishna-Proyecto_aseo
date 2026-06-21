package com.aseo.service_personal.controller;

import com.aseo.service_personal.model.Turno;
import com.aseo.service_personal.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/turnos")
public class TurnoController {

    @Autowired
    private PersonalService personalService;

    @PostMapping
    public Turno crear(@RequestBody Turno turno) {
        return personalService.guardarTurno(turno);
    }

    @GetMapping
    public List<Turno> listar() {
        return personalService.listarTurnos();
    }
}