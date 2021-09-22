package paquete;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		/*
		Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
		11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		*/
		
		int numero;
		int cont = 0;
		int mayor = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 11; i++) {
			System.out.println("Dame el número " + i + ": ");
			numero = sc.nextInt();
			while(numero < 20 || numero > 40) {
				System.out.println("Dame el número " + i + ": ");
				numero = sc.nextInt();
				cont++;
			}
			
			if(numero > mayor) {
				mayor = numero;
			}
		}
		
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número de veces que se ha introducido mal un número es: "+ cont);
	}

}
