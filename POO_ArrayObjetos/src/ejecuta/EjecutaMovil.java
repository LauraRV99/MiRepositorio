package ejecuta;

import clases.Movil;

public class EjecutaMovil {

	public static void main(String[] args) {
		Movil mov[] = new Movil[3]; // Array de 3 moviles.
		
		Movil m1 = new Movil(8, "Appel", 4);
		Movil m2 = new Movil(10, "Samsung", 5);
		Movil m3 = new Movil(12, "Xioami", 4);
		
		mov[0] = m1;
		mov[1] = m2;
		mov[2] = m3;
		
	 /*Movil mov[] = {new Movil(8, "Appel", 4),
				       new Movil(10, "Samsung", 5),
				       new Movil(12, "Xiami", 4)} */
		
		Movil movil;
		String texto;
		
		for(int i = 0; i < 3; i++) {
			movil = mov[i];
			
			texto = movil.toString();
			System.out.println(texto);
			
			//System.out.println(mov[i].toString());
		}
	}
	
}



