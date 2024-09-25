package com.viewnext.ej8;

import com.viewnext.ej8.dto.*;

public class GestionDeImpresion {
public static void main (String[]args) {
	Pagina p1 = new Pagina(4,67);
	Factura f1 = new Factura(8,650);
	System.out.println("Informes de paginas");
	System.out.println("Informe corto");
	p1.informeCorto();
	System.out.println("Informe largo");
	p1.informeLargo();
	System.out.println("Informes de facturas");
	System.out.println("Informe corto");
	f1.informeCorto();
	System.out.println("Informe largo");
	f1.informeLargo();
}
}
