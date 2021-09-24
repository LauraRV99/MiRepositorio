package paquete;

public class Vacaciones {
	
	// -- CAMPOS --
	public int dias;
	public String destino; 
	//Campo protected: Mezcla público y privado.
	//Público porque se puede heredar. Privado porque desde el objeto no se puede acceder
	public boolean playa;
	//Campo privado: no permite ser heredado.
	
	// -- CONSTRUCTORES --
	public Vacaciones(int pdias, String pdestino, boolean pplaya) {
		this.dias = pdias;
		this.destino = pdestino;
		this.playa = pplaya;
	}

	
	// -- MÉTODOS --
	public void mostrar() {
		String texto;
		
		texto = "DÍAS: " + this.dias + "\n"
				+ "DESTINO: " + this.destino + "\n"
				+ "PLAYA: " + ((this.playa == true)? "Si":"No");
		
		/* Quitamos la parte de la playa de texto -- "PLAYA: ";
		if(this.playa == true){
			texto = text + "Si"
		} else if (this.plaua == false){
			texto = texto + "No"
		}
		 */
		System.out.println(texto);
	}




	
	
	
}
