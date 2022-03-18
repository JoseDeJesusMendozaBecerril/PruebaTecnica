package com.sucursales.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sucursales.prueba.entity.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Integer> {

}
