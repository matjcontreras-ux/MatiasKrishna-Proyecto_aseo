package com.aseo.service_ventas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aseo.service_ventas.model.Factura;
import com.aseo.service_ventas.model.MetodoPago;
import com.aseo.service_ventas.model.Transaccion;
import com.aseo.service_ventas.repository.FacturaRepository;
import com.aseo.service_ventas.repository.MetodoPagoRepository;
import com.aseo.service_ventas.repository.TransaccionRepository;

@Service
public class VentasService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private MetodoPagoRepository metodoPagoRepository;

    @Autowired
    private TransaccionRepository transaccionRepository;

    
    public Factura guardarFactura(Factura f) { return facturaRepository.save(f); }
    public List<Factura> listarFacturas() { return facturaRepository.findAll(); }

    
    public MetodoPago guardarMetodoPago(MetodoPago m) { return metodoPagoRepository.save(m); }
    public List<MetodoPago> listarMetodosPago() { return metodoPagoRepository.findAll(); }

    
    public Transaccion guardarTransaccion(Transaccion t) { return transaccionRepository.save(t); }
    public List<Transaccion> listarTransacciones() { return transaccionRepository.findAll(); }
}