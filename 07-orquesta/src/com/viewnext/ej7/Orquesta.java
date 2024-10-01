package com.viewnext.ej7;

import java.util.ArrayList;
import java.util.List;

import com.viewnext.ej7.dto.Flauta;
import com.viewnext.ej7.dto.Guitarra;
import com.viewnext.ej7.dto.GuitarraElectrica;
import com.viewnext.ej7.dto.Instrumento;
import com.viewnext.ej7.dto.Tambor;

public class Orquesta {
	public static void main ( String[] args) {
List<Instrumento> instrumentos = new ArrayList<Instrumento>();

Flauta f1 = new Flauta("Flautin", "viento", "nisu");
Guitarra g1 = new Guitarra("Guitarra","cuerda",6);
GuitarraElectrica gE1 = new GuitarraElectrica("Guitarra electrica","cuerda",5,100);
Tambor t1 = new Tambor("Tambor","percursion","grande");

instrumentos.add(f1);
instrumentos.add(g1);
instrumentos.add(gE1);
instrumentos.add(t1);

for ( int j=0; j<instrumentos.size(); j++) {
	if( instrumentos.get(j).equals(t1)){
		t1.afinar();
}else{
	instrumentos.get(j).afinar();
	;
	
}
for ( int i=0; i<instrumentos.size(); i++) {
	if( instrumentos.get(i).equals(t1)){
		t1.aporrear();
}else{
	instrumentos.get(i).tocar();;
	
}
	}
}}}

