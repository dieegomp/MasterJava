package com.viewnext.dto;

public abstract class Producto {
	private final int codigoDeProducto;
	private String modelo;
	private int precio;
	private int stock;

	public Producto(int codigoDeProducto, String modelo, int precio, int stock) {
		super();
		this.codigoDeProducto = codigoDeProducto;
		this.modelo = modelo;
		this.precio = precio;
		this.stock = stock;
	}

	public int getCodigoDeProducto() {
		return codigoDeProducto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
