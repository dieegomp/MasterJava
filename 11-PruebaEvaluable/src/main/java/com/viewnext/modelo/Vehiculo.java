package com.viewnext.modelo;

import com.viewnext.interfaz.Conducible;

/** 
 * Clase Vehiculo
 * @author Diego Martin    Viewnext/Master
 * @version 1.0 27/09/2024
 */
public abstract class Vehiculo implements Conducible {
protected final String MATRICULA;
protected String color;

public Vehiculo(String matricula, String color ) {
	super();
	this.MATRICULA = matricula;
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMatricula() {
	return MATRICULA;
}


}
