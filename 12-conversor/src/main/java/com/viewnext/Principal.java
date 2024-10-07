package com.viewnext;

public class Principal {
	final static double NPARACONVERTIR = 166.386;
	public static void main(String[] args) {
		System.out.println(euroPeseta(3.0));
		System.out.println(pesetaEuro(499.158));
	}
	
	
	public static double pesetaEuro(double pesetas) {
		 return pesetas / NPARACONVERTIR;

	}

	 public static double euroPeseta(double euros) {
		return euros * NPARACONVERTIR;

	}
}
