package clases;

public class Movil {
	// -- CAMPOS --
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	private int imei;
	
	
	
	
	// -- CONSTRUCTORES --
	public Movil() {
		
	}
	public Movil(int mem, String mar, int tP, int imei){
		this.memoria = mem;
		this.marca = mar;
		this.tamanoPantalla = tP;
		this.imei = imei;
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
	
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	
	// - Redefinidos -
	@Override
	public String toString() {
		String texto;
		texto = "MEMORIA: " + this.memoria + "\n"
			  + "MARCA: " + this.marca + "\n"
			  +"TAMAÑO PANTALLA: " + this.tamanoPantalla + "\n"
			  + "IMEI: " + this.imei + "\n";
		return texto;
	}
	
	@Override
	public boolean equals(Object objCompara) {
		Movil movilCompara = (Movil) objCompara;
		boolean iguales = this.tamanoPantalla == movilCompara.tamanoPantalla;
		//Comparo el valor que he recibido (movilCompara).
		//this.tamanoPantalla es de Juan. mJuan.equals(mPedro);
		
		return iguales;
	}
	
	// - Estándar -
	// Aumenta 1BG la memoria
	public void aumentarMemoria() {
		this.memoria++;
	}
}
	