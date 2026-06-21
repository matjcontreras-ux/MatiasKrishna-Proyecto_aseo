package com.aseo.service_despachos.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_despachos.model.Vehiculo;
import com.aseo.service_despachos.service.DespachoService;
@RestController @RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired private DespachoService service;
    @PostMapping public Vehiculo save(@RequestBody Vehiculo v) { return service.guardarVehiculo(v); }
    @GetMapping public List<Vehiculo> list() { return service.listarVehiculos(); }
    @GetMapping("/{id}") public Vehiculo get(@PathVariable Long id) { return service.obtenerVehiculo(id); }
}