package com.viewnext;

public class Estadistica {

	public double media(int x1 , int x2) {
		double resultado = x1 + x2 / 2;
		return resultado;
		
	}
	
	
	public double otraMedia ( int...n) {
			int suma = 0 ;
			double resultado = 0 ;
			for (int x : n ) {
				suma += x;
			}
			resultado = suma / n.length;
			return resultado;
	}
}
