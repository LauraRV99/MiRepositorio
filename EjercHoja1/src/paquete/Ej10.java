package paquete;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// Programa que lee 10 números e indica si todos los números son iguales o no.
		
		int numeroInicial;
		int numero;
		int cont = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número inicial: ");
		numeroInicial = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
			
			if(numero == numeroInicial) {
				cont++;
			}
		}
		
		sc.close();
		
		if(cont == 10) {
			System.out.println("Todos los números son iguales. ");
		}
		else {
			System.out.println("Existe algún número distinto de " + numeroInicial);
		}
	}

}

//Lee 10 número si todos son iguales, sino, sale del bucle.
/*do {
System.out.println("Dame otro número: ");
numero = sc.nextInt();

if(numero != numeroInicial) {
	seguir = false;
} 
else {
	cont++;
}
} while (cont < 10 && seguir == true);

if(seguir == true) {
System.out.println("Todos los números son iguales. ");
} 
else {
System.out.println("Has introducido un número distinto. ");
}*/
