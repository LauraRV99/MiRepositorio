package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 números y posteriormente muestre
		solamente los que sean pares.
		*/
		
		int numeros[] = new int[4];
		int num;
		//Si se los valores int[] numeros = {1,2,3}
		Scanner sc = new Scanner(System.in);

		//El primero for es para introducir números en el array.
		for(int i = 0; i <= 3; i++) {
			System.out.print("Introudce número: ");
			numeros[i] = sc.nextInt();
			
			}
		System.out.println("El contenido del array es: ");
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("Los pares son: ");
		
		//El segundo for es para recorrer los valores del array.
		for(int i = 0; i <= 3; i++) {
			num = numeros[i];
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		sc.close();
		
	}

}
