package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
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
		//int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		
		do {
			System.out.print("Dime tu nombre: ");
			nombre = sc.nextLine();
			
			if(nombre.equalsIgnoreCase("fin")){
				continuar = false;
			} else {
				contAlumnos++;
				System.out.print("Dime tu año de nacimiento: ");
				nacim = Integer.valueOf(sc.nextLine()); //// Scanner no funciona bien cuando se utiliza para leer datos 
				// de distinto tipo. Para solucionar este inconveniente debemos 
				// leer todos los datos con texto con el método nextLine() y 
				// si es necesario convertir a número con Integer.parseInt( variable a convertir )
				//No funciona bien si se mezcla número y texto. Ahora lo ha hecho con valueOf
				edad = 2021 - nacim;
				suma = suma + edad; //suma += edad;
				
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
