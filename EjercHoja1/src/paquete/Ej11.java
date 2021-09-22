package paquete;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/*
		Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
		año de nacimiento.
		*/
		
		int nacim;
		String nombre;
		int edad;
		float EMedia;
		int suma = 0;
		int contAlumnos = 0;
		String nombreMenor = "";
		int menor = Integer.MAX_VALUE;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dime tu nombre: ");
			nombre = sc.nextLine();
			
			if(nombre.equalsIgnoreCase("fin")){
				continuar = false;
			} else {
				contAlumnos++;
				System.out.print("Dime tu año de nacimiento: ");
				nacim = Integer.parseInt(sc.nextLine()); //¿Qué es esto?
				edad = 2021 - nacim;
				suma = suma + edad;
				
				if(edad < menor) {
					menor = edad;
					nombreMenor = nombre;
				}
			}
			
		} while(continuar);
		
		sc.close();
		
		EMedia = suma/contAlumnos;
		System.out.println("La edad media es: " + EMedia);
		System.out.println("El nombre del menor es " + nombreMenor + " ya que su edad es " + menor);
	
	}

}
