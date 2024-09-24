package com.viewnext.modelo;

public class Cuenta {
	private final String titular;
	private double cantidad;

	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	

	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}


	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	public void titularObligatorio() {
		
	}
	public void ingresar(double cantidadAIngresar) {
		if( cantidadAIngresar >= 0) {
			 this.cantidad += cantidadAIngresar;
			 System.out.println("Ingreso realizado correctamente");
			 System.out.println("Tienes actualmente: " + this.cantidad );
		}else {
			System.out.println("El ingreso no a sido posible realizarlo");
		}
	}
	public void retirar(double cantidadARetirar) {
		if( cantidadARetirar >= 0) {
			 this.cantidad -= cantidadARetirar;
			 System.out.println("Retiro realizado correctamente");
			 System.out.println("Tienes actualmente: " + this.cantidad );
		}else {
			cantidad = 0;
			System.out.println("Error al retirar el dinero");
			System.out.println("Tienes actualmente: " + this.cantidad );
		}
	}
}
