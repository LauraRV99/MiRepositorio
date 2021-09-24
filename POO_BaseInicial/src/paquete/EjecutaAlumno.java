package paquete;

import java.util.Scanner;

public class EjecutaAlumno {

	public static void main(String[] args) {
		//En el método main, con el que siempre trabajamos, se van a realizar las llamadas a la clase alumno.
		//Se crean variables con la clase Alumno.
		
		// --- VARIABLES ---
		
		/* Como en la clase alumno sólo tenemos un constructor lleno, hay que rellenar el paréntesis.
		 Para que esto no suceda, creamos un constructor vacío.*/
		Alumno a1 = new Alumno();
		// Alumno a2 = new Alumno(); Como lo tenemos que hacer más abajo, este no se pone
		Alumno a3 = new Alumno();
		int suma;
		
		
		//Hay varias formas de inicializar los campos:
		
		// 1. Poniendo directamente el valor:
		a1.nombre = "Pedro";
		a1.apellido1 = "Martín";
		a1.apellido2 = "González";
		
		
		// 2.Introduciendo los valores en la declaración.
		// Para ello hay que tener un constructor que introduzca los valores en los campos.
		Alumno a2 = new Alumno("Laura", "Rodríguez", "Vaquero");
		
		
		// 3. Pidiendo por pantalla.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NOMBRE: ");
		a3.nombre = sc.nextLine();
		
		System.out.println("APELLIDO 1: ");
		a3.apellido1 = sc.nextLine();
		 
		
		System.out.println("APELLIDO 2: ");
		a3.apellido2 = sc.nextLine();
		
		sc.close();;
		
		
		// Para que lo muestre, se llama al método mostrar.
		System.out.println("\n -- ALUMNO 1 --");
		a1.mostrar();
		System.out.println("-- ALUMNO 2 --");
		a2.mostrar();
		System.out.println("-- ALUMNO 3 --");
		a3.mostrar();
		
		
		// Para que muestre las sumas, se llama al método suma.
		suma = a1.sumarNotas(10, 5);
		System.out.println("La suma del alumno 1 es: " + suma + "\n");
		
		suma = a2.sumarNotas(2, 5);
		System.out.println("La suma del alumno 2 es: " + suma + "\n");
		
		 
		suma = a3.sumarNotas(5, 5);
		System.out.println("La suma del alumno 3 es: " + suma + "\n");
		
		 
		 

	}

}
