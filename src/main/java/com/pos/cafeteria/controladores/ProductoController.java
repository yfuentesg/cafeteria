package com.pos.cafeteria.controladores;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.pos.cafeteria.entidades.Producto;
import com.pos.cafeteria.servicios.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    IProductoService productoService;

    @PostMapping
    public Producto crearProducto(@RequestBody Producto p) {
        return productoService.crearProducto(p);
    }
}
