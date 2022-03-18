package com.sucursales.prueba.service;

import java.util.List;
import java.util.Optional;

import com.sucursales.prueba.entity.Orden;
import com.sucursales.prueba.entity.Producto;
import com.sucursales.prueba.entity.Sucursal;

public interface ISucursalService {

	List<Sucursal> buscarSucursal();
	void guardarSucursal(Sucursal sucursal);
	Optional<Sucursal> obtenerSucursal(Integer id);
	void eliminarSucursal(Integer id);
}
