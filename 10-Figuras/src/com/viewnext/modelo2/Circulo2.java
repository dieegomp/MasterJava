package com.viewnext.modelo2;

import com.viewnext.intefaz.Formasgeometricas2;

public class Circulo2 implements Formasgeometricas2 {
private double diametro;
private static final double PI = Math.PI;

/** 
 * Clase que repreenta como calcular el area y el perimetro de un criculo
 * @author diego martin perez    viewnext/bec
 * @version 1.0 27/09/2024
 */

public Circulo2(double diametro) {
	super();
	this.diametro = diametro;
}

public double getDiametro() {
	return diametro;
}
public void setDiametro(double diametro) {
	this.diametro = diametro;
}

@Override
public void calcularArea() {
	double resultado;
	resultado = PI*((this.diametro/2) *(this.diametro/2));
	System.out.println("El area del circulo es: " + resultado);
}

@Override
public void calcularPerimetro() {
	double resultado;
	resultado = PI*this.diametro;
	System.out.println("El perimetro del circulo es: " + resultado);
}

}
