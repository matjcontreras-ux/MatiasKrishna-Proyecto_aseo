package com.aseo.service_inventario.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aseo.service_inventario.model.Bodega;
import com.aseo.service_inventario.model.Inventario;
import com.aseo.service_inventario.model.Producto;
import com.aseo.service_inventario.repository.BodegaRepository;
import com.aseo.service_inventario.repository.InventarioRepository;
import com.aseo.service_inventario.repository.ProductoRepository;

@Service
public class InventarioService {

    @Autowired
    private BodegaRepository bodegaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private InventarioRepository inventarioRepository;

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Bodega guardarBodega(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    public List<Bodega> listarBodegas() {
        return bodegaRepository.findAll();
    }

    public Bodega obtenerBodegaPorId(Long id) {
        return bodegaRepository.findById(id).orElse(null);
    }

    public Inventario guardar(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public List<Inventario> listar() {
        List<Inventario> inventarios = inventarioRepository.findAll();
        
        for (Inventario inv : inventarios) {
            if (inv.getProductoId() != null) {
                obtenerProductoPorId(inv.getProductoId());
            }
            if (inv.getBodegaId() != null) {
                obtenerBodegaPorId(inv.getBodegaId());
            }
        }
        
        return inventarios;
    }
}