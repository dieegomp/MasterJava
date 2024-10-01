package com.viewnext.ej9.modelo;

public class Aranha extends Animales{
	
	
	public Aranha() {
		 nPatas = 8;
	}
	
	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
	}

	@Override
	public void comer() {
		System.out.println("A la  aranha come mosquitos");
	}

}
