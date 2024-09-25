package com.viewnext.ej7.dto;

public class Tambor extends Instrumento {
private String tamaño;

public Tambor() {
	super();
}

public Tambor(String tamaño) {
	super();
	this.tamaño = tamaño;
}

public Tambor(String nombre, String tipo,String tamaño) {
	super(nombre, tipo);
	this.tamaño = tamaño;
	// TODO Auto-generated constructor stub
}

public String getTamaño() {
	return tamaño;
}

public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}
public void aporrear() {
	System.out.println("Aporreando tambor " + nombre);
}
}
