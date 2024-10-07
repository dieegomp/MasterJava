package com.viewnext.vehiculos;
import java.time.LocalTime;

import com.viewnext.modelo.Vehiculo;
/** 
 * Clase Coche
 * @author Diego Martin    Viewnext/Master
 * @version 1.0 27/09/2024
 */
public class Coche extends Vehiculo  {

    private final static int RUEDAS = 4;
    private LocalTime inicioConduccion;
    private long tiempoEnMinutos;
    private long tiempoTotal;

    public Coche(String matricula, String color) {
        super(matricula, color);
    }

    public static int getRuedas() {
        return RUEDAS;
    }

    @Override
    public void conducir() {
        inicioConduccion = LocalTime.now();
        System.out.println("La conducción ha comenzado a las " + inicioConduccion.getHour() + ":" + inicioConduccion.getMinute());
    }

    @Override
    public double  avanzar(int kmAvanzados, double velocidad) {
        double tiempoEnHoras = kmAvanzados / velocidad;
        tiempoEnMinutos = (long) (tiempoEnHoras * 60);
        System.out.println("Has avanzado en coche " + kmAvanzados + " km en " + tiempoEnMinutos + " minutos a "+ velocidad+" Km/h" );
        tiempoTotal += tiempoEnMinutos;
        return tiempoEnMinutos;
    }


    @Override
    public void parar() {
    	 LocalTime finConduccion = inicioConduccion.plusMinutes(tiempoTotal);
    	    System.out.println("La conducción ha finalizado a las " + finConduccion.getHour() + ":" + finConduccion.getMinute());
    }
}