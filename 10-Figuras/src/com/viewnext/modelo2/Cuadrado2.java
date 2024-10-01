package com.viewnext.modelo2;

import com.viewnext.intefaz.Formasgeometricas2;

public class Cuadrado2  implements Formasgeometricas2 {
private double lado;

/** 
 * Clase que repreenta como calcular el area y el perimetro de un cuadrado
 * @author diego martin perez    viewnext/bec
 * @version 1.0 27/09/2024
 */

public Cuadrado2(double lado) {
	super();
	this.lado = lado;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
public void calcularArea() {
	double resultado;
	resultado = lado*lado;
	System.out.println("El area del cuadrado es: " + resultado);
}

@Override
public void calcularPerimetro() {
	double resultado;
	resultado = lado*4;
	System.out.println("El perimetro del cuadrado es: " + resultado);
}


}
