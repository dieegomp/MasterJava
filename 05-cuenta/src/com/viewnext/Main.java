package com.viewnext;

import com.viewnext.modelo.Cuenta;

public class Main {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Jesus Rodrigez", 234.5);
		Cuenta cuenta2 = new Cuenta("pedro Rodrigez");
		System.out.println(cuenta2);
		System.out.println(cuenta1);
		cuenta1.ingresar(5.0);
		cuenta2.retirar(340);
	}
}
