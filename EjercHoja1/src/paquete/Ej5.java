package paquete;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Programa que nos informa si un número introducido es primo o no.
		
		int numero;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el número que quieres saber si es o no primo: ");
		numero = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= numero; i++) {
			if(numero%i == 0) {
				cont++;
			}
		}
		
		if(cont == 2) {
			System.out.println("El número " + numero + " es primo.");
		} else {
			System.out.println("El número " + numero + " no es primo.");
		}
	}

}
