package com.gestion.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Query("SELECT p FROM Producto p WHERE "
			+ " CONCAT(p.nombre,p.marca,p.origen,p.precio)"
			+ " LIKE %?1%")
	public List<Producto> searchAll(String palabraClave);

}
