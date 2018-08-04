package com.ibm.ropastyle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.entity.Producto;
import com.ibm.ropastyle.jpa.ProductoRepository;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;

	@RequestMapping("/producto")
	public Iterable<Producto> getProducto() {
		return productoRepository.findAll();
	}
}
