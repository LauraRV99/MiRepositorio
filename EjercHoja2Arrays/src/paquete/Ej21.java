package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
		mostrarlos en el orden inverso al que fueron introducidos.
		*/
		
		int numeros[] = new int[11];
		int numDesc[] = new int[11];
		int j = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 11; i++) {
			System.out.print("Escribe el número del puesto " + i + ": ");
			numeros[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 10; i >= 0; i--) {
			numDesc[j] = numeros[i];
			j++;
		}
		
		System.out.println("El array introducido es: " + Arrays.toString(numeros));
		System.out.println("El array dado la vuelta es: " + Arrays.toString(numDesc));
	}

}
