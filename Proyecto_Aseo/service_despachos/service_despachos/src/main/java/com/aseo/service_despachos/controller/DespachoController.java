package com.aseo.service_despachos.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_despachos.model.Despacho;
import com.aseo.service_despachos.service.DespachoService;

@RestController @RequestMapping("/despachos")
public class DespachoController {
    @Autowired private DespachoService service;
    @PostMapping public Despacho save(@RequestBody Despacho d) { return service.guardarDespacho(d); }
    @GetMapping public List<Despacho> list() { return service.listarDespachos(); }
    @GetMapping("/{id}") public Despacho get(@PathVariable Long id) { return service.obtenerDespacho(id); }
    @GetMapping("/{id}/cliente-externo") public Object getCliente(@PathVariable Long id) {
        Despacho d = service.obtenerDespacho(id);
        return d != null ? service.obtenerClienteExterno(d.getClienteId()) : null;
    }
}