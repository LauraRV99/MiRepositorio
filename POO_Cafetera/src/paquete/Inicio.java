package paquete;

import cafe.Cafetera;

public class Inicio {

	public static void main(String[] args) {
		/*
		 Diseñar una clase que simule el funcionamiento 
		 de una máquina de café.
		 La cafetera registrará el volumen de agua que puede 
		 almacenar, así como el tamaño de los vasos de café
		 o tazas que el usuario puede solicitar.
		 Se pide crear la clase cafetera y sus miembros:
		 A. CAMPOS:
		 	Volumen.
		 	Volumen del vaso. Habrá que restarle al volumen su tamaño.
		 	Volumen de la taza. Habrá que restarle al volumen su tamaño.
		 B. MÉTODOS:
		 	Servir taza.
		 	Servir vaso.
		 	Mostrar volumenes.

		 */
		
		int opcion;
		String menu;
		boolean b;

		menu = "Menú: \n"
				+ "	1.- Servir taza.\n"
				+ "	2.- Servir vaso.\n"
				+ "	3.- Mostrar volumen. \n"
				+ "	4.- Salir.\n";

		Cafetera caf = new Cafetera();
		
		System.out.println(caf.mostrar());
		
		b = caf.servirVaso();
		System.out.println(caf.mostrar());
		
		b = caf.servirTaza();
		System.out.println(caf.mostrar());

	}

}
