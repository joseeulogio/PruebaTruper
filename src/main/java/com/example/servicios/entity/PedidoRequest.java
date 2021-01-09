package com.example.servicios.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class PedidoRequest {

	private int id;
	private double total;
	private LocalDate dateSale;
	private String username;
	private int idPedido;
	private String sku;
	private double amount;
	private double price;
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
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PedidoRequest [id=" + id + ", total=" + total + ", dateSale=" + dateSale + ", username=" + username
				+ ", idPedido=" + idPedido + ", sku=" + sku + ", amount=" + amount + ", price=" + price + "]";
	}
	
	
	
}
