package com.viewnext.modelo;

public class Cafetera {
	private int capacidadMax;
	private int capacidadActual;

	public Cafetera(int capacidadMax) {
		super();
		this.capacidadMax = capacidadMax;
		this.capacidadActual = capacidadMax;
	}

	public Cafetera() {
		super();
		this.capacidadMax = 1000;
		this.capacidadActual = 0;
	}

	public Cafetera(int capacidadMax, int capacidadActual) {
		super();
		if (capacidadActual > capacidadMax) {
			capacidadActual = capacidadMax;
		}
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public void llenarCafetera() {
		capacidadActual = capacidadMax;
		System.out.println("La cafetera se ha rellenado");
	}

	public  void servirTaza() {
		int tazaCafe = 30;
		if (capacidadActual >= tazaCafe) {
			capacidadActual -= tazaCafe;
			System.out.println("La cafetera tiene actualmente: " + capacidadActual + "g de cafe");
		} else {
			capacidadActual = 0;
			System.out.println("La taza se ha servido con los ultimos granos de cafe");
		}
	}

	public void vaciarCafetera() {
		capacidadActual = 0;
		System.out.println("La cafetera se ha vaciado");
	}

	public void rellenarCafetera(int capacidadARellenar) {
		capacidadActual += capacidadARellenar;
		System.out.println("La cafetera tiene actualmente: " + capacidadActual + "g de cafe");
	}
}
