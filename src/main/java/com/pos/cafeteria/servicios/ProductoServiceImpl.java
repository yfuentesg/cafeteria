package com.pos.cafeteria.servicios;

import com.pos.cafeteria.entidades.Producto;
import com.pos.cafeteria.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public Producto crearProducto(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public List<Producto> consultarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto consultarProducto(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto actualizarProducto(Producto p) {
        Producto productoActual = productoRepository.findById(p.getId()).orElse(null);

        if(productoActual == null){
            return null;
        }

        productoActual.setNombre(p.getNombre() == null ? productoActual.getNombre() : p.getNombre());
        productoActual.setEstado(p.getEstado());

        return productoActual;

    }

    @Override
    public void eliminarProducto(Integer id) {
        productoRepository.findById(id).ifPresent(productoActual -> productoRepository.delete(productoActual));
    }
}
