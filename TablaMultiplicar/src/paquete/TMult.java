package paquete;

public class TMult {

	public static void main(String[] args) {
		// Crear una tabla de multiplicar.
		
		int num = 5;
		int resultado;
		String fila;
		
		/*
		 5 x 1 = 5
		 ...
		 5 x 10 = 50
		 ===========
		 num cont resultado = num*cont
		 */
		
		for(int cont = 1; cont < 11; cont++) {
			resultado = num*cont;
			
			fila = num + " x " + cont + " = " + resultado;
			System.out.println(fila);
		}
		
	}

}
