package com.ibm.ropastyle.dao;

import com.ibm.ropastyle.entity.Pedido;
import com.ibm.ropastyle.entity.PedidosCliente;

public class PedidoRequest {
	private Iterable<Pedido> pedidos;
	private PedidosCliente pedidosCliente;
	
	public Iterable<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Iterable<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public PedidosCliente getPedidosCliente() {
		return pedidosCliente;
	}
	public void setPedidosCliente(PedidosCliente pedidosCliente) {
		this.pedidosCliente = pedidosCliente;
	}
}
