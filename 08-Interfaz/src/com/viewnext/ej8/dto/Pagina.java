package com.viewnext.ej8.dto;

public class Pagina implements Imprimible {
private int nPagina;
private int nLineas;

	public Pagina() {
	super();
}

	public Pagina(int nPaginas, int nLineas) {
	super();
	this.nPagina = nPaginas;
	this.nLineas = nLineas;
}

	public int getnPaginas() {
		return nPagina;
	}

	public void setnPaginas(int nPaginas) {
		this.nPagina = nPaginas;
	}

	public int getnLineas() {
		return nLineas;
	}

	public void setnLineas(int nLineas) {
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("imprimiendo pagina "+ nPagina +" que contiene " + nLineas + " lineas");
		
	}

	@Override
	public void informeCorto() {
		System.out.println("imprimiendo pagina "+ nPagina );
		
	}

}
