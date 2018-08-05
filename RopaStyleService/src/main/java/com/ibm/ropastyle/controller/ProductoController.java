package com.ibm.ropastyle.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.entity.Producto;
import com.ibm.ropastyle.jpa.ProductoRepository;

@CrossOrigin
@RestController
public class ProductoController {
	private static final Logger log = LogManager.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoRepository productoRepository;

	@RequestMapping("/producto")
	public Iterable<Producto> getProducto() {		
		return productoRepository.findAll();
	}
	
	@RequestMapping("/producto/{categoria}")
	public Iterable<Producto> getProductoCategoria(@PathVariable("categoria") int categoria) {
		log.info("Request: /producto/" + categoria);
		return productoRepository.findByCategoria(categoria);
	}
}
