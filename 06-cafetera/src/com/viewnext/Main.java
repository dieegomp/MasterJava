package com.viewnext;
import com.viewnext.modelo.Cafetera;
public class Main {
public static void main(String[]args){
	Cafetera c1 = new Cafetera();
	c1.rellenarCafetera(50);
	c1.servirTaza();
	c1.llenarCafetera();
	c1.servirTaza();
	c1.vaciarCafetera();
	
}
}
