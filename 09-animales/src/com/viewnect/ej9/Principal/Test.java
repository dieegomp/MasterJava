package com.viewnect.ej9.Principal;

import com.viewnext.ej9.modelo.Aranha;
import com.viewnext.ej9.modelo.Gato;
import com.viewnext.ej9.modelo.Pez;

public class Test {

	public static void main(String[] args) {
		Gato g1 = new Gato("felipe");
		Aranha a1 = new Aranha();
		Pez p1 = new Pez();
		
		g1.comer();
		g1.jugar();
		g1.andar();
		
		a1.andar();
		a1.comer();
		
		p1.comer();
		p1.jugar();
		p1.andar();
		
	}

}
