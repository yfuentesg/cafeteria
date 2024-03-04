package com.pos.cafeteria.servicios;

import com.pos.cafeteria.entidades.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public Producto crearProducto(Producto p);
    public List<Producto> consultarProductos();
    public Producto consultarProducto(Integer id);
    public Producto actualizarProducto(Producto p);
    public void eliminarProducto(Integer id);
}
