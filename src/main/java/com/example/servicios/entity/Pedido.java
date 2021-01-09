package com.example.servicios.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="pedidos_w")
public class Pedido {
	@Id
	@Column(name ="ID")
	private int id;
	@Column(name ="TOTAL")
	private double total;
	@Column(name ="DATE_SALE")
	private LocalDate dateSale;
	@Column(name ="USERNAME")
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getDateSale() {
		return dateSale;
	}
	public void setDateSale(LocalDate dateSale) {
		this.dateSale = dateSale;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", total=" + total + ", dateSale=" + dateSale + ", username=" + username + "]";
	}
	
	
	

}
