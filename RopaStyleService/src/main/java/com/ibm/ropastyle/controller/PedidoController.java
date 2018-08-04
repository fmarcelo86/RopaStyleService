package com.ibm.ropastyle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.entity.Pedido;
import com.ibm.ropastyle.jpa.PedidoRepository;

@RestController
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;

	private static final String RESPONSE_OK = "ok";
	private static final String RESPONSE_FAILED = "failed";

	@GetMapping("/pedido")
	public Iterable<Pedido> getPedido() {
		return pedidoRepository.findAll();
	}

	@PostMapping("/pedido")
	public String setPedido(@RequestBody Iterable<Pedido> pedido) {
		try {
			pedidoRepository.saveAll(pedido);
		} catch (Exception e) {
			return RESPONSE_FAILED;
		}
		return RESPONSE_OK;
	}
}
