package com.viewnext.ej9.modelo;

import com.viewnext.ej9.interfaces.Mascota;

public class Gato extends Animales implements Mascota {
	private String nombre;

	public Gato(String nombre) {
		this.nombre = nombre;
		nPatas = 4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void jugar() {
		System.out.println("A " + nombre + " le gusta jugar con la pelota");

	}

	@Override
	public void andar() {
		super.andar();
	}

	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer peces y araña");
	}

}
