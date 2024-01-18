package com.gestion.productos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(nullable = false, length = 60)
	public String nombre;

	@Column(nullable = false, length = 60)
	public String marca;

	@Column(nullable = false, length = 60)
	public String origen;

	@Column(nullable = false, length = 60)
	public float precio;

	public Producto() {
		super();
	}

	public Producto(Long id, String nombre, String marca, String origen, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.origen = origen;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
