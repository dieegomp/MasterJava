package com.viewnext.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.viewnext.Calculadora;

class CalculadoraTest {

	@Test
	void sumarTest() {
		// Arrange/Organizar

		Calculadora cal = new Calculadora();

		// Act/Ejecutar

		double suma = cal.sumar(2.5, 4.5);

		// Assert/Aseverar
		assertEquals(7.0, suma);
	}
	@Test
	void restarTest() {
		Calculadora cal2 = new Calculadora();
		double resta = cal2.restar(5.0,0.0);
		assertEquals(5.0, resta);

	}
}
