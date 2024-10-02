package com.viewnext.principal;

import com.viewnext.vehiculos.Coche;
/** 
 * Clase Principal
 * @author Diego Martin    Viewnext/Master
 * @version 1.0 27/09/2024
 */
public class Principal {
	
public static void main(String[] args) {
	Coche coche = new Coche("saf","fsdf");
	coche.conducir();
	coche.avanzar(12, 30.9);
	coche.avanzar(350, 120);
	coche.avanzar(350, 120);
	coche.avanzar(350, 120);
	coche.avanzar(350, 120);
	coche.parar();
}
}
