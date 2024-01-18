package com.gestion.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entity.Producto;
import com.gestion.productos.repository.ProductoRepository;

@Service
public class ProductoServicio {

	@Autowired
	private ProductoRepository productoRepositorio;

	public List<Producto> listAllProducts(String palabraClave) {

		if (palabraClave != null) {
			return productoRepositorio.searchAll(palabraClave);
		}

		return productoRepositorio.findAll();
	}

	public void saveProduct(Producto producto) {
		productoRepositorio.save(producto);
	}

	public Producto getProductById(Long id) {
		return productoRepositorio.findById(id).get();
	}

	public void deleteProduct(Long id) {
		productoRepositorio.deleteById(id);
	}
}
