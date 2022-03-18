package com.sucursales.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sucursales.prueba.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal,Integer> {

}
