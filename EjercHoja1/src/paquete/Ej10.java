package paquete;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// Programa que lee 10 n�meros e indica si todos los n�meros son iguales o no.
		
		int numeroInicial;
		int numero;
		int cont = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero inicial: ");
		numeroInicial = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Introduce otro n�mero: ");
			numero = sc.nextInt();
			
			if(numero == numeroInicial) {
				cont++;
			}
		}
		
		sc.close();
		
		if(cont == 10) {
			System.out.println("Todos los n�meros son iguales. ");
		}
		else {
			System.out.println("Existe alg�n n�mero distinto de " + numeroInicial);
		}
	}

}

//Lee 10 n�mero si todos son iguales, sino, sale del bucle.
/*do {
System.out.println("Dame otro n�mero: ");
numero = sc.nextInt();

if(numero != numeroInicial) {
	seguir = false;
} 
else {
	cont++;
}
} while (cont < 10 && seguir == true);

if(seguir == true) {
System.out.println("Todos los n�meros son iguales. ");
} 
else {
System.out.println("Has introducido un n�mero distinto. ");
}*/
