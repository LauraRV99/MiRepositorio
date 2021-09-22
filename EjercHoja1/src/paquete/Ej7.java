package paquete;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		/*
		Programa que pide el n�mero de calificaciones a introducir, y una nota de corte. A
		continuaci�n se introducir�n las calificaciones, para finalmente indicar cu�ntas
		calificaciones han igualado o superado la nota de corte.
		*/
		
		int numCalif;
		float notaCorte;
		float calif;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el n�mero de calificaciones a introducir: ");
		numCalif = sc.nextInt();
		
		do {
			
		System.out.println("Indica la nota de corte: ");
		notaCorte = sc.nextInt();
		
		}while (notaCorte < 0 || notaCorte > 14);
		
		for(int i = 1; i <= numCalif; i++) {
			do {
			System.out.println("Indica la calificaci�n n�mero " + i + ": ");
			calif = sc.nextInt();
			}while(calif < 0 || calif > 14);
			
			if(calif >= notaCorte) {
				cont++;
			}
		}
		sc.close();
		
		System.out.println("El n�mero de calif que han superado o igualado a la nota de corte es: " + cont);

	}

}
