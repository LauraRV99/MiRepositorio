package paquete;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		/*
		Programa que muestra todos los divisores de un número introducido. Entre los divisores no
		se incluirá el propio número.
		*/
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el número del cual quieres saber sus divisores: ");
		numero = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i < numero; i++) {
			if(numero%i == 0) {
				System.out.println(i);
			}
		}
	}

}
