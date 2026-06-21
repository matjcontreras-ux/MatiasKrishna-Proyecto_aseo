package com.aseo.service_personal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aseo.service_personal.model.AsignacionTarea;
import com.aseo.service_personal.model.Empleado;
import com.aseo.service_personal.model.Turno;
import com.aseo.service_personal.repository.AsignacionTareaRepository;
import com.aseo.service_personal.repository.EmpleadoRepository;
import com.aseo.service_personal.repository.TurnoRepository;

@Service
public class PersonalService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private TurnoRepository turnoRepository;

    @Autowired
    private AsignacionTareaRepository asignacionTareaRepository;

    public Empleado guardarEmpleado(Empleado e) {
        return empleadoRepository.save(e);
    }

    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public Turno guardarTurno(Turno t) {
        return turnoRepository.save(t);
    }

    public List<Turno> listarTurnos() {
        return turnoRepository.findAll();
    }

    public AsignacionTarea guardarAsignacion(AsignacionTarea a) {
        return asignacionTareaRepository.save(a);
    }

    public List<AsignacionTarea> listarAsignaciones() {
        return asignacionTareaRepository.findAll();
    }
}