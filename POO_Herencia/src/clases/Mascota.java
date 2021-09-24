package clases;

public class Mascota {
	//extend Object es que hereda de la clase Objeto
	
	// -- CAMPOS --
	public String nombre;
	public int edad;
	public String raza;
	
	
	// -- CONSTRUCTORES --
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Mascota() {
		
	}
	
	
	// -- MÉTODOS --
	public String mostrar() { //Suele hacerse con void
		String texto;
		texto = "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
		
		return texto;
		
	}

	@Override //Sobreescribir método
	public String toString() {
		return "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
	}
	
	
	
}