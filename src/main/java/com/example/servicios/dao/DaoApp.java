package com.example.servicios.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.servicios.entity.Pedido;
import com.example.servicios.entity.PedidoDetalle;
@Component
public class DaoApp {

	@Autowired
	RepositoryPedido repo;
	@Autowired
	RepositoryDetalle repoDetalle;
	public void altaPedido(Pedido pedido,PedidoDetalle detalle) {
		System.out.println("pedido "+pedido.toString());
		System.out.println("pedidodetalle "+detalle.toString());
		repo.save(pedido);
		repoDetalle.save(detalle);
	}
}
