package com.aseo.service_soportes.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aseo.service_soportes.model.TicketSoporte;
import com.aseo.service_soportes.service.SoporteService;
@RestController @RequestMapping("/tickets")

public class TicketSoporteController {
    
    @Autowired private SoporteService service;
    
    @PostMapping public TicketSoporte save(@RequestBody TicketSoporte t) { return service.guardarTicket(t); }
    
    @GetMapping public List<TicketSoporte> list() { return service.listarTickets(); }
    
    @GetMapping("/{id}") public TicketSoporte get(@PathVariable Long id) { return service.obtenerTicket(id); }
    
    @GetMapping("/{id}/cliente-externo") public Object getCliente(@PathVariable Long id) {
        TicketSoporte t = service.obtenerTicket(id);
        return t != null ? service.obtenerClienteExterno(t.getClienteId()) : null;
    }
}