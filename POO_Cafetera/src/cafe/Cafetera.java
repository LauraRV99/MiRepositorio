package cafe;

public class Cafetera {
	// -- CAMPOS. --
	public int volumenTotal;
	public int volumenVaso;
	public int volumenTaza;
	
	
	
	// -- CONSTRUCTORES. --
	public Cafetera(int volumenTotal, int volumenVaso, int volumenTaza) {
		this.volumenTotal = volumenTotal;
		this.volumenVaso = volumenVaso;
		this.volumenTaza = volumenTaza;
	}


	public Cafetera() {
		
	}
	
	
	// -- MÉTODOS. --
	public String mostrar() {
		String texto;
		
		texto = "VOLUMEN TOTAL " + this.volumenTotal + "\n"
				+ "VOLUMEN TAZA " + this.volumenTaza + "\n"
				+ "VOLUMEN VASO " + this.volumenVaso + "\n";
		
		return texto;
	}
	
	
	public boolean servirVaso() {
		boolean servido = true;
		
		if(this.volumenTotal < this.volumenTaza) {
			servido = false;
		} else {
			this.volumenTotal = this.volumenTotal - this.volumenTaza;
		}
		return servido;
	}
	
	
	public boolean servirTaza() {
		boolean servido = true;
		
		if(this.volumenTotal < this.volumenVaso) {
			servido = false;
		} else {
			this.volumenTotal = this.volumenTotal - this.volumenVaso;
		}
		return servido;
	}
	
	
}
