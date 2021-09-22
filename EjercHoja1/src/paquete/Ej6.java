package paquete;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		/*
		Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al
		último, nos muestra la media. En caso contrario, no se mostrará nada.
		*/
		
		int numeroInicial;
		int numeros;
		int numeroFinal;
		float media;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer número: ");
		numeroInicial = sc.nextInt();
		suma += numeroInicial;
		
		for(int i = 1; i < 8; i++) {
			System.out.print("Escribe los números: ");
			numeros = sc.nextInt();
			suma += numeros;
		}
		
		sc.close();
		
		System.out.print("Escribe el último número: ");
		numeroFinal = sc.nextInt();
		suma += numeroFinal;
		
		if(numeroInicial == numeroFinal) {
			media = (float)suma/9;
			System.out.print("La media es: " + media);
		} else {
			System.out.print("El primer número y el último no coinciden.");
		}
		
	}

}
