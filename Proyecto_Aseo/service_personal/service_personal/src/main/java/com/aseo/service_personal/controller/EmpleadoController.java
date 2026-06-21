package com.aseo.service_personal.controller;

import com.aseo.service_personal.model.Empleado;
import com.aseo.service_personal.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empleados")
public class EmpleadoController {

    @Autowired
    private PersonalService personalService;

    @PostMapping
    public Empleado crear(@RequestBody Empleado empleado) {
        return personalService.guardarEmpleado(empleado);
    }

    @GetMapping
    public List<Empleado> listar() {
        return personalService.listarEmpleados();
    }
}