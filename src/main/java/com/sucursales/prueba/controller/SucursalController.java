package com.sucursales.prueba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sucursales.prueba.entity.Orden;
import com.sucursales.prueba.entity.Sucursal;
import com.sucursales.prueba.service.IOrdenService;
import com.sucursales.prueba.service.ISucursalService;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

	
	@Autowired
	ISucursalService serviceSucursales;
	
	@GetMapping("/obtener")
	public List<Sucursal> buscarSucursales(){
		return serviceSucursales.buscarSucursal();
	}
	
	
	@PostMapping("/guardar")
	public void insertarSucursal(@RequestBody Sucursal sucursal) {
		serviceSucursales.guardarSucursal(sucursal);
	}
	
	@GetMapping("/obtenerSucursal/{id}")
	public Optional<Sucursal> obtenerOrden(@PathVariable("id") Integer id) {
		return serviceSucursales.obtenerSucursal(id);
	}
	
}
