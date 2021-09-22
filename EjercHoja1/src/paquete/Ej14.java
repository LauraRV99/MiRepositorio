package paquete;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		Programa que lee una secuencia de 10 n�meros y muestra el mayor de los m�ltiplos de 5,
		y el menor de los m�ltiplos de 3. Si no hubiera ning�n m�ltiplo, el programa lo indicar�a.
		*/
		
		int numero;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int numeroC = 0;
		int numeroT = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Dame el numero " + i + ": ");
			numero =sc.nextInt();
			
			if(numero > mayor && numero%5 == 0) {
				numeroC = numero;
				mayor = numeroC;
			} else if(numero < menor && numero%3 == 0) {
				numeroT = numero;
				menor = numeroT;
			}
		}
		
		sc.close();
		
		if (numeroC == 0) {
			System.out.println("No hay m�ltiplos de 5.");
		} else {
			System.out.println("El mayor m�ltiplo de 5 es: " + numeroC);
		}
		
		if (numeroT == 0) {
			System.out.println("No hay m�ltiplos de 3.");
		} else {
			System.out.println("El menor m�ltiplo de 3 es: " + numeroT);
		}
	}

}
