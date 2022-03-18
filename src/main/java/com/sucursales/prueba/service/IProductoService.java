package com.sucursales.prueba.service;

import java.util.List;
import java.util.Optional;

import com.sucursales.prueba.entity.Orden;
import com.sucursales.prueba.entity.Producto;

public interface IProductoService {

	List<Producto> buscarProducto();
	void guardarProducto(Producto producto);
	Optional<Producto> obtenerProducto(Integer id);
	void eliminarProducto(Integer id);
}
