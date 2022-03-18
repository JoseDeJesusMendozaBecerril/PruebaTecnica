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
import com.sucursales.prueba.service.IOrdenService;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {

	
	@Autowired
	IOrdenService serviceOrdenes;
	
	@GetMapping("/obtener")
	public List<Orden> buscarOrdenes(){
		return serviceOrdenes.buscarOrdenes();
	}
	
	
	@PostMapping("/guardar")
	public void insertarOrden(@RequestBody Orden orden) {
		 serviceOrdenes.guardarOrden(orden);
	}
	
	@GetMapping("/obtenerOrden/{id}")
	public Optional<Orden> obtenerOrden(@PathVariable("id") Integer id) {
		return serviceOrdenes.obtenerOrden(id);
	}
	
	
	
}
