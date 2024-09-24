package com.viewnext.dto;

public class Telefono extends Producto {

	private String operador;

	public Telefono(int codigoDeProducto, String modelo, int precio, int stock) {
		super(codigoDeProducto, modelo, precio, stock);
	}

	public Telefono(int codigoDeProducto, String modelo, int precio, int stock, String operador) {
		super(codigoDeProducto, modelo, precio, stock);
		this.operador = operador;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

}
