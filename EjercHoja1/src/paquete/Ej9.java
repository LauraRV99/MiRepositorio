package paquete;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		/*
		Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
		el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
		llegaste”, según corresponda. De la misma manera, y al terminar el programa, se
		mostrarán los mensajes “Acertaste” o bien “Intentos agotados”.
		
		DEL PROFE, A MI NO ME SALE
		*/
		
		
		int numero, numeroApuesta, intentosRestantes=10;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("JUGADOR 1: Intro. numero entre el 1 y el 100: ");
			numero = sc.nextInt();
		}while(!(numero>0 && numero<101));
		
		
		System.out.println("JUGADOR 2: adivina el numero: ");
		do
		{
			numeroApuesta = sc.nextInt();
			if(numeroApuesta==numero)
			{
				continuar = false;
			}
			else
			{
				intentosRestantes--;
				if(numeroApuesta<numero)
				{
					System.out.println("No llegaste");
				}
				else
				{
					System.out.println("Te pasaste");
				}
			}
			if(intentosRestantes==0)
			{
				continuar = false;
			}
		} while(continuar);
		
		if(intentosRestantes>0)
		{
			System.out.println("Acertaste");
		}
		else
		{
			System.out.println("Intentos agotados");
		}
		sc.close();
		
	}

}

/*package paquete;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		/*
		Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
		el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
		llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
		mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�.
		
	
		int nJug1;
		int nJug2;
		int intentos = 1;
		boolean acertado = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("J1, introduce un número 1 - 100: ");
			nJug1 = sc.nextInt();
			
		} while(nJug1 < 1 || nJug1 > 100);
		 
		do {
			System.out.print("J2, introduce un número 1 - 100: ");
			nJug2 = sc.nextInt();
			
		} while(nJug2 < 1 || nJug2 > 100);
		
		do {
			if(nJug1 == nJug2) {
				acertado = true;
				
			} else {
				intentos++;
				
				if(nJug2 < nJug1) {
					System.out.println("No llegaste");
				} else {
					System.out.println("Te pasaste");
				}
			}
			
		}  while(acertado || intentos < 10);
		
		System.out.println("fuera");
		if(intentos < 10) {
			System.out.println("Acertaste.");
		} else {
			System.out.println("Intentos agotados.");
		}
	}

}*/


