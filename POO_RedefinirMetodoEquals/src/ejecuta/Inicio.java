package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		// ---------------------------
		// | mJuan | mMaria | mPedro |
		// ---------------------------
		//   111       232      955
		
		//HashMap<Integer, Movil> moviles; //Las claves van a ser los imei y los valores los objetos de tipo móvil.
		
		var moviles = new HashMap<Integer, Movil>();
		
		Movil mJuan = new Movil(4, "Samsung", 4, 111);
		Movil mMaria = new Movil(6, "Iphone", 4, 232);
		Movil mPedro = new Movil(4, "Xiaomi", 5, 955);
		Movil mBusqueda = new Movil(6, "Iphone", 4, 232); //La dirección de memoria es distinta a la de María aunque tenga los mismos valores.
		
		
		// Cargar la colección con todos los móviles.
		//Añadimos los elementos a la colección.
		// moviles.put(111, mJuan);
		moviles.put(mJuan.getImei(), mJuan);
		moviles.put(mMaria.getImei(), mMaria);
		moviles.put(mPedro.getImei(), mPedro);
		
		
		//Comrpobamos si un elementos se encuentra en la colección por su valor.
		/*
		 El método containsValue requiere redefinir el método equals de la clase Movil
		 para saber que campo debe comparar para determinar que dos objetos sean iguales.
		 
		 En caso de no hacerlo, los objetos se compararán utilizando sus direcciones de memoria.
		 */

		if(moviles.containsValue(mBusqueda)) {
			System.out.println("Encontrado.");
		} else {
			System.out.println("No se encuentra.");
		}
		
		mJuan.equals(mPedro);
	
	}

}
