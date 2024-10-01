package com.viewnext.ej9.modelo;

public abstract class Animales {
	protected int nPatas;

	public Animales() {
		super();
	}

	public Animales(int nPatas) {
		super();
		this.nPatas = nPatas;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void andar() {
		System.out.println("este animal anda sobre: " + getnPatas());
	}

	public void comer() {

	}

}
