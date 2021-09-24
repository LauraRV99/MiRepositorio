package paquete;

import java.util.Scanner;

public class Ej22Profe {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
		algún número repetido se le debe notificar, y no ha de ser contabilizado.
		*/

		int n = 10, j, numero;
		int numeros[] = new int[n];
		boolean repetido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. " + n + " numeros sin repetir: ");
		for(int i=0; i<n; i++)
		{
			do
			{
				numero = sc.nextInt();
				
				repetido = false;
				j = 0;
				
				while(j<i && !repetido)
				{
					if(numeros[j]==numero)
					{
						repetido = true;
					}
					j++;
				}
				
				if(repetido)
				{
					System.out.println("El numero no puede repetirse");
				}
			}while(repetido);
			numeros[i]=numero;
		}
		sc.close();
		

		// mostramos los números
		System.out.println("Los numeros introducidos sin repetir son:");
		for(int i=0; i<n; i++)
		{
			System.out.println(numeros[i]);
		}
		
		System.out.println("FIN");
	}
}
