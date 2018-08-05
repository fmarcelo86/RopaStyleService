package com.ibm.ropastyle.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.dao.PedidoRequest;
import com.ibm.ropastyle.entity.Pedido;
import com.ibm.ropastyle.jpa.PedidoRepository;
import com.ibm.ropastyle.jpa.PedidosClienteRepository;

@CrossOrigin
@RestController
public class PedidoController {
	private static final Logger log = LogManager.getLogger(PedidoController.class);

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidosClienteRepository pedidosClienteRepository;

	private static final String RESPONSE_OK = "ok";
	private static final String RESPONSE_FAILED = "failed";

	@GetMapping("/pedido")
	public Iterable<Pedido> getPedido() {
		return pedidoRepository.findAll();
	}

	@PostMapping("/pedido")
	public String setPedido(@RequestBody PedidoRequest pedido) {
		try {
			log.info("Request: /pedido" + pedido);
			pedidoRepository.saveAll(pedido.getPedidos());
			pedido.getPedidosCliente().setIdPedido(pedido.getPedidos().iterator().next().getId());
			pedidosClienteRepository.save(pedido.getPedidosCliente());
		} catch (Exception e) {
			e.printStackTrace();
			return RESPONSE_FAILED;
		}
		return RESPONSE_OK;
	}
}
