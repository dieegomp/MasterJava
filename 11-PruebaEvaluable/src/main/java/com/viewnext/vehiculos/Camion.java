package com.viewnext.vehiculos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.viewnext.interfaz.Conducible;
import com.viewnext.modelo.Vehiculo;

/** 
 * Clase Camion
 * @author Diego Martin    Viewnext/Master
 * @version 1.0 27/09/2024
 */
public class Camion extends Vehiculo implements Conducible {

	private final static int ruedas = 4;
	private LocalTime inicioConduccion;
	private long tiempoEnMinutos;
	private long tiempoTotal;
	List<Double> tacografo = new ArrayList<Double>();

	public Camion(String matricula, String color) {
		super(matricula, color);
	}

	public static int getRuedas() {
		return ruedas;
	}

	public List<Double> getTacografo() {
		return tacografo;
	}

	@Override
	public void conducir() {
		inicioConduccion = LocalTime.now();
		System.out.println(
				"La conducción ha comenzado a las " + inicioConduccion.getHour() + ":" + inicioConduccion.getMinute());
	}

	@Override
	public double avanzar(int kmAvanzados, double velocidad) {
		if ( velocidad < 100.0) {
		double tiempoEnHoras = kmAvanzados / velocidad;
		tiempoEnMinutos = (long) (tiempoEnHoras * 60);
		System.out.println("Has avanzado  en camion " + kmAvanzados + " km en " + tiempoEnMinutos + " minutos a " + velocidad + " Km/h");
		tiempoTotal += tiempoEnMinutos;
		tacografo.add(velocidad);
		}else {
			System.out.println("La velocidad no es adecuada");
			double tiempoEnHoras = kmAvanzados / velocidad;
			tiempoEnMinutos = (long) (tiempoEnHoras * 60);
			System.out.println("Has avanzado " + kmAvanzados + " km en " + tiempoEnMinutos + " minutos a " + velocidad + " Km/h");
			tiempoTotal += tiempoEnMinutos;
			tacografo.add(velocidad);
		}
		return tiempoEnMinutos;
		
	}

	@Override
	public void parar() {
		LocalTime finConduccion = inicioConduccion.plusMinutes(tiempoTotal);
		System.out.println(
				"La conducción ha finalizado a las " + finConduccion.getHour() + ":" + finConduccion.getMinute());
	}
}
