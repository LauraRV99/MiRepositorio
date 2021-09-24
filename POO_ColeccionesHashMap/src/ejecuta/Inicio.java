package ejecuta;

import java.util.HashMap;

public class Inicio {

	public static void main(String[] args) {
		//Colecciones Map: su índice podría no ser numérico. 
		//No tiene tamaño como array, se puede meter todo lo que queramos.
		
		// 		-----------------
		// 	v	20 | 10 | 15  | 40
		// 		-----------------
		//	k	Ot Inv  Prim  Ver ---- índices de texto.
		
		//HashMap<String, Integer> temperaturasMaxEstac = new HashMap<String, Integer>();
		//int Integer
		//float Float
		
		var temperaturasMaxEstac = new HashMap<String, Integer>();
		int temp;
		String mensaje;
		
		temperaturasMaxEstac.put("Otoño", 20);
		temperaturasMaxEstac.put("Invierno", 10);
		temperaturasMaxEstac.put("Primavera", 15);
		temperaturasMaxEstac.put("Verano", 40);

		temp = temperaturasMaxEstac.get("Primavera");
		System.out.println("El máximo en primavera es de " + temp + " grados." + "\n");
		
		
		// Recorremos la colección Otoño, Invierno, Primavera, Verano, es decir, las clase.
		for(String clave: temperaturasMaxEstac.keySet()) {
			temp = temperaturasMaxEstac.get(clave);
			
			mensaje = "La temp maxima en " + clave + " es " + temp;
			System.out.println(mensaje);
		}
		
		
		// Eliminar el elemento de la clave "Primavera".
		if(temperaturasMaxEstac.containsKey("Primavera")) {
			temperaturasMaxEstac.remove("Primavera");
			System.out.println("Eliminado");
		} else {
			System.out.println("No se ha eliminado porque no se encuenta");
		}
		//temperaturasMaxEstac.remove("Primavera");
		
		
		//Comprobar si un valor se encuentra en la colección
		int valor = 99;
		if(temperaturasMaxEstac.containsValue(valor)) {
			System.out.println("El valor se encuentra");
		} else {
			System.out.println("El valor no se encuentra");
		}
		
		
		// Modificamos el elemento de la clave "Verano"
		   temperaturasMaxEstac.put("Verano", 42);
		   System.out.println("\n");
		   for(String clave: temperaturasMaxEstac.keySet()) {
				temp = temperaturasMaxEstac.get(clave);
				
				mensaje = "La temp maxima en " + clave + " es " + temp;
				System.out.println(mensaje);
			}
		
		
		/*
		 Ejemplo de bucle for each.
		 int notas[] = {10, 9, 10, 7};
		
		 for(int nota : notas) {
			System.out.println(nota);
		}
		 */
		
	}

}
