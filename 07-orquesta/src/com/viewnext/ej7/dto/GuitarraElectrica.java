package com.viewnext.ej7.dto;

public class GuitarraElectrica extends Guitarra {
private int potencia;

public GuitarraElectrica() {
	super();
}

public GuitarraElectrica(int potencia) {
	super();
	this.potencia = potencia;
}

public GuitarraElectrica(String nombre, String tipo, int numeroCuerdas,int potencia) {
	super(nombre, tipo, numeroCuerdas);
	this.potencia = potencia;
	// TODO Auto-generated constructor stub
}

public int getPotencia() {
	return potencia;
}

public void setPotencia(int potencia) {
	this.potencia = potencia;
}

@Override
public void tocar() {
System.out.println("Tocando la guitarra electrica");
}
}
