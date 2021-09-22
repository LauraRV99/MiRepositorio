package paquete;

public class TMultDobleFor {

	public static void main(String[] args) {
		/*
		 Programa que muestre las 10 primeras tablas
		 de multiplicar. También se quiere la suma del resultado.
		 */
		
		int result;
		String fila;
		int suma;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("\n");
			System.out.println("Tabla del " + i);
			suma = 0; //Se pone aquí porque cuando entre en el segundo for tiene que valer 0. Si se pone
			//arriba, se va a quedar guardado el valor de la suma anterior.
			
			for(int j = 1; j <= 10; j++) {
				result = i*j;
				suma = suma + result;
				
				fila = i + " x "+  j + " = " + result;
				System.out.println(fila);
			}

			System.out.println("============");
			System.out.println("La suma vale   " + suma);
		}

	}

}
