package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		Movil mJuan = new Movil(4, "Xiaomi", 3, 1);
		Movil mMaria = new Movil(4, "Xiaomi", 3, 2);
		
		// Así sale pero no debería compararse así
		/*if(mMaria.getMemoria() == mJuan.getMemoria() &&
		   mMaria.getMarca().equals(mJuan.getMarca()) &&
		   mMaria.getTamanoPantalla() == mJuan.getTamanoPantalla()) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}*/
		
		
		//Hemos creado un campo único, que identifica los móviles,
		if(mJuan.getImei() == mMaria.getImei()) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
	}

}
