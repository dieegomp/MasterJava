package com.viewnext.ejemplo1;

public class Biblioteca {
	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.isbn = 12345;
		libro1.titulo = "el mundo de java";
		libro1.autor = "pepito";
		libro1.numeroPaginas = 245;
		System.out.println("Libro 1: " + libro1.titulo);
		Libro libro2 = new Libro(67890);
		System.out.println("Libro 2: " + libro2.isbn);
		libro1.titulo = "esto es un desastre";

	}
}
