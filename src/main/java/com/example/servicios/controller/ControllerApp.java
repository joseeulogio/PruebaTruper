package com.example.servicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicios.entity.PedidoRequest;
import com.example.servicios.service.ServiceApp;

@RestController
@RequestMapping("/api/producto")
public class ControllerApp {

	@Autowired
	ServiceApp service;
	@PostMapping("/insert")
	public void altaProducto(@RequestBody PedidoRequest request ) {
		
		service.altaPedido(request);
	}
}
