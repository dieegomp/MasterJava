package com.viewnext.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.viewnext.Principal;

class coversorTest {
		@Test
		void euroPesetasTest() {
			double pesetas = Principal.euroPeseta(3.0);
			assertEquals(499.158, pesetas);
		}
		@Test
		void PesetasEurosTest() {
			double euros = Principal.pesetaEuro(499.158);
			assertEquals(3.0, euros);

		}
	}
