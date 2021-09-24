package ejecuta;

import clases.Hamster;
import clases.Mascota;

public class Inicio {

	public static void main(String[] args) {
		Mascota miMascota = new Mascota("Puka", 5);
		String texto;
		
		
		//Imprimir:
		texto = miMascota.mostrar();
		System.out.println(texto);
		System.out.println(miMascota.mostrar()); //Primero se llama a mostrar y devuelve  el String texto
		//y luego hace el sysout.
		
		texto = miMascota.toString();
		System.out.println(texto);
		
		
		// Hamster:
		Hamster miHamster1 = new Hamster("Marrón", "ExtraVital", "Hamns", 3);
		Hamster miHamster2 = new Hamster();
		
		texto = miHamster1.toString(); //Sólo tengo los campos nombre y edad, quiero los otros también.
		System.out.println(texto);
		
		
	}

}
