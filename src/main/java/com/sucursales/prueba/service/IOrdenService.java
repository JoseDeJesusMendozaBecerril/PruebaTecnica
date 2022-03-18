package com.sucursales.prueba.service;

import java.util.List;
import java.util.Optional;

import com.sucursales.prueba.entity.Orden;

public interface IOrdenService {

	List<Orden> buscarOrdenes();
	void guardarOrden(Orden orden);
	Optional<Orden> obtenerOrden(Integer id);
	void eliminarOrden(Integer id);
}
