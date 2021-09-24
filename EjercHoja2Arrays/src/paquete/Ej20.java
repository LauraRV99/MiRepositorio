package paquete;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
		busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
		caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
		programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
		seguir buscando?(s/n)”.
		*/
		
		int numeros[] = new int[9];
		int numEnc;
		String buscar;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce 9 números: ");
		for(int i = 0; i < 9; i++) {
			numeros[i] = Integer.valueOf(sc.nextLine());
		}
		
		do {
			System.out.println("Dame el número que deseas buscar: ");
			numEnc = Integer.valueOf(sc.nextLine()); //Sino el String buscar da error.
			
			for(int i = 0; i < 9; i++) {
				if(numEnc == numeros[i]) {
					cont++;
				} 
			}
			if(cont == 0) {
				System.out.println("No se ha encontrado el número " + numEnc);
			} else {
				System.out.println("El numero " + numEnc + " se ha encontrado " + cont +" veces.");
			}
			
			System.out.println("¿Desea buscar otro número?");
			buscar = sc.nextLine();
		} while(buscar.equalsIgnoreCase("s"));
		
		sc.close();
		
	}

}

