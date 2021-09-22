package paquete;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		/*
		Programa que lee 87 n�meros. Al finalizar mostrar� el m�ximo introducido, y cu�ntas veces
		se repite dicho m�ximo.
		*/
		
		int numero;
		int maximo = Integer.MIN_VALUE;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Dame el n�mero " + i + ": ");
			numero = sc.nextInt();
			
			if(numero > maximo) {
				cont = 1; //Si encuentra un nuevo n�mero m�ximo tiene que reiniciarse el contador a 1.
				maximo = numero;
			} else if(numero == maximo) { //Hace una cosa o la otra, por eso else if.
				cont++;
			}
		}
		
		sc.close();
		
		System.out.println("El n�mero m�ximo " + maximo + " se ha repetido " + cont + " veces.");
	}

}
