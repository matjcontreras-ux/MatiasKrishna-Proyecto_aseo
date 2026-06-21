package com.aseo.service_despachos.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_despachos.model.RutaEntrega;
import com.aseo.service_despachos.service.DespachoService;
@RestController @RequestMapping("/rutas")
public class RutaEntregaController {
    @Autowired private DespachoService service;
    @PostMapping public RutaEntrega save(@RequestBody RutaEntrega r) { return service.guardarRuta(r); }
    @GetMapping public List<RutaEntrega> list() { return service.listarRutas(); }
    @GetMapping("/{id}") public RutaEntrega get(@PathVariable Long id) { return service.obtenerRuta(id); }
}