package com.viewnext.ejemplo2;

public class Biblioteca {
	public static void main(String[] args) {
		Libro libro1 = new Libro(12345);
		libro1.setTitulo("El mundo de java privado");
		libro1.setAutor("Pepito");
		libro1.setNumeroPaginas(1000);

		Libro libro2 = new Libro(67890);
		libro2.setTitulo("practicas viewnext");
		libro2.setAutor("juanito");
		libro2.setNumeroPaginas(345);

		System.out.println(libro1);
		System.out.println(libro2);

		System.out.println(libro1.compararLibros(libro1, libro2));

//		int paginas1 = libro1.getNumeroPaginas();
//		int paginas2 = libro2.getNumeroPaginas();
//		if (paginas1 > paginas2) {
//			System.out.println("el libro mas largo es el 1");
//		}else {
//			System.out.println("el libro mas largo es el 2");
//		}

	}
}
