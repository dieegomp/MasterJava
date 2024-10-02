package com.viewnext.modelo2;

import com.viewnext.intefaz.Formasgeometricas2;

public class Rectangulo2 implements Formasgeometricas2  {
private double longitud;
private double ancho;

/** 
 * Clase que repreenta como calcular el area y el perimetro de un rectangulo
 * @author diego martin perez    viewnext/bec
 * @version 1.0 27/09/2024
 */

public Rectangulo2(double longitud, double ancho) {
	super();
	this.longitud = longitud;
	this.ancho = ancho;
}
public double getLongitud() {
	return longitud;
}
public void setLongitud(double longitud) {
	this.longitud = longitud;
}
public double getAncho() {
	return ancho;
}
public void setAncho(double ancho) {
	this.ancho = ancho;
}
@Override
public double calcularArea() {
	double resultado;
	resultado = longitud *ancho;
	System.out.println("El area del rectangulo es: " + resultado);
	return resultado;
}
@Override
public double calcularPerimetro() {
	double resultado;
	resultado = (2*longitud) + (2*ancho);
	System.out.println("El perimetro del rectangulo es: " + resultado);
	return resultado;
}

}
