package com.sucursales.prueba.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ordenes")
public class Orden {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orden_id;
	
	
	private Sucursal sucursal;
	
	private Date fecha;
	
	private Double total;
	
	
	
	public Integer getOrden_id() {
		return orden_id;
	}
	public void setOrden_id(Integer orden_id) {
		this.orden_id = orden_id;
	}
	
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Orden [orden_id=" + orden_id + ", fecha=" + fecha + ", total=" + total + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
