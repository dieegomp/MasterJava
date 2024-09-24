package com.viewnext.ej1.dto;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	private List <Equipo> equipos;
	private List <Partido> partidos;
	private List <Jugador> jugadores;
	
	public Liga() {
		equipos = new ArrayList <>();
		partidos = new ArrayList <>();
		jugadores = new ArrayList <>();
	}
	
	public void addEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void addPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void addgoles(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public List<Partido>partidos(){
		return partidos;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}


}


