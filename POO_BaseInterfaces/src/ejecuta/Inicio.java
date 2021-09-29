package ejecuta;

import java.util.Scanner;

import clases.Listado;

public class Inicio {

	public static void main(String[] args) {
		/*Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir.
		*/
		
		int opcion;
		int numero;
		Listado list = new Listado(); // Para llamar a la clase listado, es necesario crearnos una variable de tipo Listado.
		Scanner sc = new Scanner(System.in);
		String menu = "Menú:\r\n"
				+ "		1.- Introducir número entero.\n"
				+ "		2.- Listar números.\n"
				+ "		3.- Eliminar número.\n"
				+ "		4.- Eliminar todos los números.\n"
				+ "		5.- Salir.";
		
		do {
			System.out.println(menu);
			System.out.println("Elige una opcion: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch(opcion) {
			case 1:
				// Este primer caso introduce un valor nuevo.
				System.out.println("Introduce un número: ");
				numero = Integer.valueOf(sc.nextLine());
				
				list.nuevo(numero); //Se llama al método nuevo para añadirlo.
				break;
				
			case 2:
				// El caso 2 es listar. Como el array se declara en la clase listado, sólo hay que llamar al método.
				list.listar();
				break;
				
			case 3:
				// El caso 3 es eliminar un número, por lo que se pide el número a eliminar.
				System.out.println("Indica el número que quieres eliminar: ");
				numero = Integer.valueOf(sc.nextLine());
				
				list.eliminar(numero);
				break;
				
			case 4:
				// Como se elimina el listado entero y éste está en la clase listado, simplemente se llama al método.
				list.eliminar();
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Opción errónea.");
				break;
			}
			
		} while(opcion != 5);

	}

}
