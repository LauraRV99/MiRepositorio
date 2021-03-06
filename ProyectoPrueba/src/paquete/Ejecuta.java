//PROGRAMA DE LAURA RODRÃ�GUEZ VAQUERO.
package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		11. Programa que lee nombre y aÃ±o de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno â€œfinâ€�. En ese momento mostrarÃ¡ la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre â€œfinâ€�, no nos ha de pedir el
		aÃ±o de nacimiento. 
		*/
		
		int nacim; //Año nacimiento.
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
				System.out.print("Dime tu aÃ±o de nacimiento: ");
				nacim = Integer.valueOf(sc.nextLine()); //// Scanner no funciona bien cuando se utiliza para leer datos 
				// de distinto tipo. Para solucionar este inconveniente debemos 
				// leer todos los datos con texto con el mÃ©todo nextLine() y 
				// si es necesario convertir a nÃºmero con Integer.parseInt( variable a convertir )
				//No funciona bien si se mezcla nÃºmero y texto. Ahora lo ha hecho con valueOf
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
	
	//FIN DEL PROGRAMA.

}

/*OTRA FORMA DE HACER. SIN BOOLEANOS.
System.out.print("Dime tu nombre: ");
nombre = sc.nextLine();

while(nombre.equals("fin") == false){
		System.out.print("Dime tu aÃ±o de nacimiento: ");
		nacim = Integer.valueOf(sc.nextLine());
		
		edad = anioActual - nacim;
		
		contEdad++;
		
		suma += edad;
		
		if(edad < menor){
			menor = edad;
			nombreMenor = nombre;
		}
		
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
}*/
		


