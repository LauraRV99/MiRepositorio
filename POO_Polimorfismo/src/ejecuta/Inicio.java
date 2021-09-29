package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;


public class Inicio {

	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[2];
		Vehiculo veh;
		
		Coche miCoche = new Coche("Coche", 1300, "Verde", true, ECombustible.gasolina);
		System.out.println(miCoche.toString());
		
		Tren miTren = new Tren("Tren", 14000, "azul", 10, true);
		System.out.println(miTren.toString());
		
		//Cuando se añadan los tipos Coche y Tren a Vehiculo
		//se van a convertir implícitamente. Sólo es posible
		//si se heredade ella.
		
		
		// -- POLIMORFISMO. --
		//Se usa para almacenar en el array objetos de distinto tipo.
		//vehiculos[0] = (Vehiculo)miCoche Conversión explícita.
		vehiculos[0] = miCoche; //Conversión implícita.
		
		//vehiculos[1] = (Vehiculo)miTren Conversión explícita.
		vehiculos[1] = miTren;
		
		
		// -- RECORREMOS EL ARRAY. --
		for(int i = 0; i < 2; i++) {
			veh = vehiculos[i];
			
			//En el hipotético caso de que no sepamos que tipos son:
			if(veh instanceof Tren) {
				miTren = (Tren)veh;
				
				
			} else if(veh instanceof Coche) {
				miCoche = (Coche)veh;
			}
		}
		
		//Instanciar un objeto de un tipo como otro.
		Vehiculo v = new Tren(); //Vehiculo v = (Vehiculo) new Tren();
		
		
		
		//Paso de parámetros.
		v.mostrar(miTren); //Se convierte a vehiculo solo.
		v.mostrar(miCoche);
		
		
	}
	
	
	
	
	

}
