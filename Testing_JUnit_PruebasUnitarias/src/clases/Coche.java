package clases;

import java.util.Random;

public class Coche {
	//En la clase coche hay que crearse algo para probar.
	
	public int acelerar(int velocidad) {
		velocidad++; //Primero se suma 1.
		return velocidad; //Luego se devuelve velocidad.
		//return velocidad++; Primero devuelve 100 y luego suma 1, porque tiene prioridad return sobre el incremento.
		
		// int resultado = velocidad++; primero asigna el valor de velocidad y luego suma +1. Por lo tanto va a seguir devolviendo 100.
		// Tiene prioridad asignación ante incremento.
		// SOLUCIÓN: resultado = ++velocidad;
	}
		
	public boolean multa() {
		Random r = new Random();
		boolean resultado = r.nextBoolean();
		
		return resultado;
	}
}
