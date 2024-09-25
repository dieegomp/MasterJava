package com.viewnext.ej7.dto;

public class Guitarra extends Instrumento {
	private int numeroCuerdas;

	public Guitarra() {
		super();
	}

	public Guitarra(int numeroCuerdas) {
		super();
		this.numeroCuerdas = numeroCuerdas;
	}
	
	public Guitarra(String nombre, String tipo,int numeroCuerdas) {
		super(nombre, tipo);
		this.numeroCuerdas = numeroCuerdas;
		// TODO Auto-generated constructor stub
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}
}
