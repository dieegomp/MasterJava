package com.viewnext.ej7.dto;

public class Tambor extends Instrumento {
private String tamanho;

public Tambor() {
	super();
}

public Tambor(String tamaño) {
	super();
	this.tamanho = tamaño;
}

public Tambor(String nombre, String tipo,String tamaño) {
	super(nombre, tipo);
	this.tamanho = tamaño;
	// TODO Auto-generated constructor stub
}

public String getTamaño() {
	return tamanho;
}

public void setTamaño(String tamaño) {
	this.tamanho = tamaño;
}
public void aporrear() {
	System.out.println("Aporreando " + nombre);
}
}
