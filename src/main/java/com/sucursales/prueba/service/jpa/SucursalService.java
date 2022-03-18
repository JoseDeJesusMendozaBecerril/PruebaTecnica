package com.sucursales.prueba.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucursales.prueba.entity.Sucursal;
import com.sucursales.prueba.repository.ProductoRepository;
import com.sucursales.prueba.repository.SucursalRepository;
import com.sucursales.prueba.service.ISucursalService;

@Service
public class SucursalService implements ISucursalService {

	@Autowired
	private SucursalRepository repoSucursal;
	
	@Override
	public List<Sucursal> buscarSucursal() {
		return repoSucursal.findAll();
	}

	@Override
	public void guardarSucursal(Sucursal sucursal) {
		repoSucursal.save(sucursal);
	}

	@Override
	public Optional<Sucursal> obtenerSucursal(Integer id) {
		return repoSucursal.findById(id);
	}

	@Override
	public void eliminarSucursal(Integer id) {
		repoSucursal.deleteById(id);

	}

}
