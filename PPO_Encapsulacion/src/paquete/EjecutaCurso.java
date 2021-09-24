package paquete;

import java.util.Scanner;


public class EjecutaCurso {

	public static void main(String[] args) {
		// -- VARIABLES --
		Curso java;
		Scanner sc = new Scanner(System.in);
		

		
		// Inicializar los campos:
		
		// 1. java.nombre = "JAVA";  Esto da error, no se puede hacer porque el campo es privado.
		
		// 2. Introduciendo los valores en la declaración.
		java = new Curso("Hola", "Adios", 90);
		
		// 3. Pidiendo por pantalla.
		// java.nombre = sc.nextLine(); Tampoco se puede hacer por ser un campo privado.
		
		
		/*
		 Existe el método GETTER para inicializar los campos. Este método se escribe en la clase Curso.
		 */
		
		// -- PEDIR A GETTER y SETTER.
		java.setAcademia("Adios"); //¿Esto es pa algo? ¿Como se pide al SETTER?
		java.setHoras(90);
		java.setNombre("Hola");
		
		System.out.println("El nombre es: " + java.getNombre());
		System.out.println("Las academia es: " + java.getAcademia());
		System.out.println("Las horas son: " + java.getHoras());
		

		
		
		
		
		
		

	}

}
