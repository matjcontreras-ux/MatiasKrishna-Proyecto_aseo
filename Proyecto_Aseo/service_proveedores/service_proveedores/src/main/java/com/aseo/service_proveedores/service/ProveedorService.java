package com.aseo.service_proveedores.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aseo.service_proveedores.model.Proveedor;
import com.aseo.service_proveedores.model.OrdenCompra;
import com.aseo.service_proveedores.model.RecepcionStock;
import com.aseo.service_proveedores.repository.ProveedorRepository;
import com.aseo.service_proveedores.repository.OrdenCompraRepository;
import com.aseo.service_proveedores.repository.RecepcionStockRepository;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    @Autowired
    private RecepcionStockRepository recepcionStockRepository;

   
    public Proveedor guardarProveedor(Proveedor p) { return proveedorRepository.save(p); }
    public List<Proveedor> listarProveedores() { return proveedorRepository.findAll(); }

   
    public OrdenCompra guardarOrden(OrdenCompra o) { return ordenCompraRepository.save(o); }
    public List<OrdenCompra> listarOrdenes() { return ordenCompraRepository.findAll(); }

   
    public RecepcionStock guardarRecepcion(RecepcionStock r) { return recepcionStockRepository.save(r); }
    public List<RecepcionStock> listarRecepciones() { return recepcionStockRepository.findAll(); }
}