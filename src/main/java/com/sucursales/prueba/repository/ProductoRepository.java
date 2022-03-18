package com.sucursales.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sucursales.prueba.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {

}
