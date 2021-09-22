package paquete;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/*
		Programa que lee un n�mero y muestra la suma de sus divisores, sin incluir el propio
		n�mero entre sus divisores.
		*/
		
		int numero;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un n�mero: ");
		numero =sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i < numero; i++) {
			if(numero%i == 0) {
				suma = suma + i;
			}
		}
		
		System.out.println("La suma de sus divisores es: " + suma);
	}

}
