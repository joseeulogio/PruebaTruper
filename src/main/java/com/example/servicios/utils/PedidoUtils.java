package com.example.servicios.utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.example.servicios.entity.Pedido;
import com.example.servicios.entity.PedidoDetalle;
import com.example.servicios.entity.PedidoRequest;

@Component
public class PedidoUtils {

	public Pedido seteoPedido(PedidoRequest request) {
		Pedido pedido= new Pedido();
		pedido.setId(request.getId());
		pedido.setTotal(request.getTotal());
		pedido.setDateSale(LocalDate.now());
		pedido.setUsername(request.getUsername());
		return pedido;
	}
	public PedidoDetalle seteoPedidoDetalle(PedidoRequest request) {
		PedidoDetalle pedido= new PedidoDetalle();
		pedido.setId(request.getId());
		pedido.setIdPedido(request.getId());
		pedido.setSku(request.getSku());
		pedido.setAmount(request.getAmount());
		pedido.setPrice(request.getPrice());
		return pedido;
	}
}
