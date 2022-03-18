package com.sucursales.prueba.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucursales.prueba.entity.Orden;
import com.sucursales.prueba.entity.Producto;
import com.sucursales.prueba.repository.OrdenRepository;
import com.sucursales.prueba.repository.ProductoRepository;
import com.sucursales.prueba.service.IProductoService;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository repoProductos;
	
	@Override
	public List<Producto> buscarProducto() {
		return repoProductos.findAll();
	}

	@Override
	public void guardarProducto(Producto producto) {
		repoProductos.save(producto);
	}

	@Override
	public Optional<Producto> obtenerProducto(Integer id) {
		return repoProductos.findById(id);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repoProductos.deleteById(id);

	}

}
