package com.viewnext.modelo;

public class Cuadrado extends Rectangulo {
private double lado;

/** 
 * Clase que repreenta como calcular el area y el perimetro de un cuadrado
 * 
 * @author diego martin perez    viewnext/bec
 * @version 1.0 27/09/2024
 */

public Cuadrado(double lado) {
	super(lado, lado);
	this.lado = lado;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
public double calcularArea() {
	double resultado;
	resultado = lado*lado;
	System.out.println("El area del cuadrado es: " + resultado);
	return resultado;
}

@Override
public double calcularPerimetro() {
	double resultado;
	resultado = lado*4;
	System.out.println("El perimetro del cuadrado es: " + resultado);
	return resultado;
}


}
