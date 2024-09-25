package com.viewnext.ej7.dto;

public class Flauta extends Instrumento {
	private String modelo;

	public Flauta() {
		super();
	}

	public Flauta(String modelo) {
		super();
		this.modelo = modelo;
	}
	public Flauta(String nombre, String tipo,String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println(" soplando");
	}



}
