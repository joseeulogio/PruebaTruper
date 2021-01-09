package com.example.servicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.servicios.entity.Pedido;

public interface RepositoryPedido extends JpaRepository<Pedido, Integer>{

}
