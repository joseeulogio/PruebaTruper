package com.example.servicios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servicios.dao.DaoApp;
import com.example.servicios.entity.Pedido;
import com.example.servicios.entity.PedidoDetalle;
import com.example.servicios.entity.PedidoRequest;
import com.example.servicios.utils.PedidoUtils;

@Service
public class ServiceApp {

	@Autowired
	PedidoUtils util;
	@Autowired
	DaoApp daoApp;
	public void altaPedido(PedidoRequest request) {
		
		Pedido pedido = util.seteoPedido(request);
		PedidoDetalle detalle = util.seteoPedidoDetalle(request);
		daoApp.altaPedido(pedido, detalle);
	}
}
