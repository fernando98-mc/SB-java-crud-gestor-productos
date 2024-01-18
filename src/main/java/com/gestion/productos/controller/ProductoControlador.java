package com.gestion.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestion.productos.entity.Producto;
import com.gestion.productos.service.ProductoServicio;

@Controller
public class ProductoControlador {

	@Autowired
	private ProductoServicio productoServicio;

	@RequestMapping("/")
	public String viewHomePage(Model modelo, @Param("palabraClave") String palabraClave) {
		// String palabraclave = "sony";
		List<Producto> listarProductos = productoServicio.listAllProducts(palabraClave);
		modelo.addAttribute("listarProductos", listarProductos);
		modelo.addAttribute("palabraClave", palabraClave);
		return "index";
	}

	@RequestMapping("/add")
	public String showformAddProduct(Model model, Producto producto) {
		model.addAttribute("producto", producto);
		return "new-product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("producto") Producto producto) {
		productoServicio.saveProduct(producto);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView editProducto(@PathVariable(value = "id") Long id, Producto producto) {
		ModelAndView modelo = new ModelAndView("edit-product");
		producto = productoServicio.getProductById(id);
		modelo.addObject("producto", producto);
		return modelo;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(value = "id") Long id) {
		productoServicio.deleteProduct(id);
		return "redirect:/";
	}

}