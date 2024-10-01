package com.viewnext.ej9.modelo;

import com.viewnext.ej9.interfaces.Mascota;

public class Pez extends Animales implements Mascota {
	private String nombre;

	public Pez() {
		nPatas = 0;
	}

	public Pez(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void jugar() {
		System.out.println("estoy nadando");

	}

	@Override
	public void andar() {
		System.out.println("En realidad no ando nado");
	}

	@Override
	public void comer() {
		System.out.println("Los peces comen placton");
	}

}
