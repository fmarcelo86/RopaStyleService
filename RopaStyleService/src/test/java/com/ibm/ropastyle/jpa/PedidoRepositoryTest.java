package com.ibm.ropastyle.jpa;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.ropastyle.dao.PedidoRequest;
import com.ibm.ropastyle.entity.Pedido;
import com.ibm.ropastyle.entity.PedidosCliente;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PedidoRepositoryTest {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidosClienteRepository pedidosClienteRepository;

	@Test
	public void testFindAll() {
		Iterable<Pedido> findAll = pedidoRepository.findAll();
		assertNotNull(findAll);
	}
	
	@Test
	public void testSavePedido() {
		Iterable<Pedido> findAll = pedidoRepository.findAll();
		assertNotNull(findAll);
		
		PedidoRequest pedido = new PedidoRequest();
		Set<Pedido> pedidoProductos = new HashSet<>();
		pedidoProductos.add(new Pedido());
		pedido.setPedidos(pedidoProductos);
		pedido.setPedidosCliente(new PedidosCliente());
		
		Iterable<Pedido> saveAll = pedidoRepository.saveAll(pedido.getPedidos());
		assertNotNull(saveAll);
		pedido.getPedidosCliente().setIdPedido(pedido.getPedidos().iterator().next().getId());
		
		PedidosCliente save = pedidosClienteRepository.save(pedido.getPedidosCliente());
		assertNotNull(save);
	}
}
