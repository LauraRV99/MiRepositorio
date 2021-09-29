package clases;

public class Vehiculo {
	// -- CAMPOS. --
	public String tipo;
	public int peso;
	public String color;
	
	
	// -- CONSTRUCTORES. --
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}

	public Vehiculo() {
		
	}

	
	
	// -- MÉTODOS. --
	@Override
	public String toString() { //Ponerlo bien
		return "Vehiculo [tipo=" + tipo + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	public void mostrar(Vehiculo v) {
		Tren t;
		Coche c;
		
		if(v instanceof Coche) {
			c = (Coche) v;
		} else {
			t = (Tren) v;
		}
	}
	
	
	

}
