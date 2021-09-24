package clases;

public class Movil {
	// -- CAMPOS --
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	
	
	// -- CONSTRUCTORES --
	public Movil() {
		
	}
	public Movil(int mem, String mar, int tP) {
		this.memoria = mem;
		this.marca = mar;
		this.tamanoPantalla = tP;
	}
	
	
	
	// -- MÉTODOS GETTERS Y SETTERS --
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}


	// - Redefinidos -
	@Override
	public String toString() {
		String texto;
		texto = "MEMORIA: " + this.memoria + "\n"
			  + "MARCA: " + this.marca + "\n"
			  +"TAMAÑO PANTALLA: " + this.tamanoPantalla + "\n";
		return texto;
	}
	
	// - Estándar -
	// Aumenta 1BG la memoria
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
	
	
}
