package com.aseo.service_personal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aseo.service_personal.model.AsignacionTarea;
import com.aseo.service_personal.service.PersonalService;

@RestController
@RequestMapping("/api/asignaciones-tareas")
public class AsignacionTareaController {

    @Autowired
    private PersonalService personalService;

    @PostMapping
    public AsignacionTarea guardar(@RequestBody AsignacionTarea a) {
        return personalService.guardarAsignacion(a);
    }

    @GetMapping
    public List<AsignacionTarea> listar() {
        return personalService.listarAsignaciones();
    }
}