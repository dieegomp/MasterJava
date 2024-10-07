package com.viewnext.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.viewnext.vehiculos.Camion;
import com.viewnext.vehiculos.Coche;

class PeTest {

	@Test
	void avanzarCocheTest() {
		Coche c1 = new Coche("3456 HJH", "verde");
		double tiempo = c1.avanzar(12, 60);
		assertEquals(12.0, tiempo);
		
	}
	@Test
	void avanzarCamionTest() {
		Camion ca1 = new Camion("3456 PJH", "amarillo");
		double tiempo = ca1.avanzar(12, 60);
		assertEquals(12.0, tiempo);
		
	}

}
