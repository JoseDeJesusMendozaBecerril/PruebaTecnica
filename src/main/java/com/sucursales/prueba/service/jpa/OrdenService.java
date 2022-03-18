package com.sucursales.prueba.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucursales.prueba.entity.Orden;
import com.sucursales.prueba.repository.OrdenRepository;
import com.sucursales.prueba.service.IOrdenService;

@Service
public class OrdenService implements IOrdenService {

	@Autowired
	private OrdenRepository repoOrdenes;
	
	@Override
	public List<Orden> buscarOrdenes() {
		return repoOrdenes.findAll();
	}

	@Override
	public void guardarOrden(Orden orden) { //save and update
		repoOrdenes.save(orden);
	}

	@Override
	public Optional<Orden> obtenerOrden(Integer id) {
		return repoOrdenes.findById(id);
	}

	@Override
	public void eliminarOrden(Integer id) {
		repoOrdenes.deleteById(id);
	}

}
