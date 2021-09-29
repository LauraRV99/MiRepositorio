package clases;

public class Tren extends Vehiculo {
	// -- CAMPOS. --
	public int vagones;
	public boolean largoRecorrido;
	
	
	
	// -- CONSTRUCTORES. --
	public Tren(String tipo, int peso, String color, 
				int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}

	public Tren() {
		
	}

	
	
	
	// -- MÉTODOS. --
	@Override
	public String toString() { //Ponerlo bien
		return super.toString() + "Tren [vagones=" + vagones + ", largoRecorrido=" + largoRecorrido + "]";
	}
	
}
