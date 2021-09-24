package clases;

public class Hamster extends Mascota{
	// -- CAMPOS --
	public String colorPelo;
	public String marcaPienso;
	
	
	// -- CONSTRUCTORES --
	public Hamster() {
		super(); //Llama al constructor vacío de la clase padre Mascota.
	}


	public Hamster(String colorPelo, String marcaPienso, 
				   String nombre, int edad) { //Nombre y edad pertenecen al constructor lleno de Mascota.
		super(nombre, edad); //Siempre en laprimera fila.
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	
	//Está el método toString aunque no aparezca, porque es heredado de Mascota.
	//Redefinimos.
	public String toString() {
		String texto;
		
		texto = super.toString() 
				+ "COLOR PELO: " + this.colorPelo + "\n"
				+ "MARCA PIENSO: " + this.marcaPienso + "\n";
		return texto;
	}
	
	
	
	

	
	
	
}


