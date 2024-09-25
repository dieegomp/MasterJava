package com.viewnext.ej7;

import com.viewnext.ej7.dto.Flauta;
import com.viewnext.ej7.dto.Guitarra;
import com.viewnext.ej7.dto.GuitarraElectrica;
import com.viewnext.ej7.dto.Tambor;

public class Orquesta {
	public static void main ( String[] args) {
Flauta f1 = new Flauta("Flautin", "viento", "nisu");
Guitarra g1 = new Guitarra("Guitarra","cuerda",6);
GuitarraElectrica gE1 = new GuitarraElectrica("Guitarra electrica","cuerda",5,100);
Tambor t1 = new Tambor("Tambor","percursion","grande");
f1.tocar();
g1.tocar();
gE1.tocar();
t1.aporrear();

	}
}
