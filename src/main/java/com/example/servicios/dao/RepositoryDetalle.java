package com.example.servicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.servicios.entity.PedidoDetalle;

public interface RepositoryDetalle extends JpaRepository<PedidoDetalle, Integer> {

}
