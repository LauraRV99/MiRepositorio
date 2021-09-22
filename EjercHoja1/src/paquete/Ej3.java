package paquete;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		/*
		Programa que lee de manera consecutiva números hasta que se introducen dos números
		iguales seguidos.
		*/
		
		int a;
		int b;
		boolean cont = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número a: ");
		a = sc.nextInt();
		
		do {
			System.out.println("Introduce el número b: ");
			b = sc.nextInt();
			
			if(a == b) {
				cont = false;
			} else {
				a = b;
			}
			
		} while(cont);
		
		System.out.println("Has introducido dos números iguales. Este número es el " + b);
	}

}
