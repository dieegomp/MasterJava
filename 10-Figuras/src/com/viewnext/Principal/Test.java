package com.viewnext.Principal;

import com.viewnext.modelo.Circulo;
import com.viewnext.modelo.Cuadrado;
import com.viewnext.modelo.Rectangulo;
import com.viewnext.modelo2.Circulo2;
import com.viewnext.modelo2.Cuadrado2;
import com.viewnext.modelo2.Rectangulo2;

public class Test {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(25);
		Cuadrado cu1 = new Cuadrado(2);
		Rectangulo r1 = new Rectangulo(13,7);
		
		System.out.println("Con una clase");
		c1.calcularArea();
		c1.calcularPerimetro();
		cu1.calcularArea();
		cu1.calcularPerimetro();
		r1.calcularArea();
		r1.calcularPerimetro();
		
		Circulo2 c21 = new Circulo2(25);
		Cuadrado2 cu21 = new Cuadrado2(2);
		Rectangulo2 r21 = new Rectangulo2(13,7);

		System.out.println("Con una interfaz");
		c21.calcularArea();
		c21.calcularPerimetro();
		cu21.calcularArea();
		cu21.calcularPerimetro();
		r21.calcularArea();
		r21.calcularPerimetro();
	}

}
