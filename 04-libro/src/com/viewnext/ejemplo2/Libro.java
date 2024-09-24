package com.viewnext.ejemplo2;

import java.util.Objects;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	public Libro(int isbn) {
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "El libro con isbn " + isbn + " escrito por el autor " + autor + " tiene " + numeroPaginas + " páginas";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn && Objects.equals(titulo, other.titulo);
	}
public String compararLibros(Libro libro1,Libro libro2) {
	String libroMasLargo;
	if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
		libroMasLargo="el libro mas largo es el 1";
	}else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
		libroMasLargo="el libro mas largo es el 2";
	}else {
		libroMasLargo = "el libro es igual";
	}
	
	return libroMasLargo;
	
}
}
