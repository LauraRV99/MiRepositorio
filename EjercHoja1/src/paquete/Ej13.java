package paquete;

public class Ej13 {

	public static void main(String[] args) {
		// Programa que muestra los 100 primeros número primos.
		
		int numero = 0;
		
		do {
			numero++;
			int cont = 0;
			for(int i = 1; i <= numero; i++) {
				if(numero%i == 0) {
					cont++;
				}
			}
			
			if(cont == 2) {
				System.out.println(numero);
			}
		}while(numero < 100);
		

	}

}
