package com.example.servicios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="pedidos_detalle_w")
public class PedidoDetalle {

	@Id
	@Column(name ="ID")
	private int id;
	@Column(name ="ID_PEDIDO")
	private int idPedido;
	@Column(name ="SKU")
	private String sku;
	@Column(name ="AMOUT")
	private double amount;
	@Column(name ="PRICE")
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "PedidoDetalle [id=" + id + ", idPedido=" + idPedido + ", sku=" + sku + ", amount=" + amount + ", price="
				+ price + "]";
	}
	
	
}
