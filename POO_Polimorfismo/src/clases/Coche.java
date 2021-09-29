package clases;



public class Coche extends Vehiculo{
	//Se hereda lo público y lo protegido,lo privado no
	
	// -- CAMPOS. --
	public boolean camara;
	public ECombustible combustible;
	
	
	
	
	// -- CONSTRUCTORES. --
	public Coche(String tipo, int peso, String color, //Campos de coche
				 boolean camara,ECombustible gasolina) { //Campos de vehículo
		super(tipo, peso, color);
		this.camara = camara;
		this.combustible = gasolina;
	}


	public Coche() {
		super();
	}


	@Override
	public String toString() { //Ponerlo bien
		return super.toString() + "Coche [camara=" + camara + ", combustible=" + combustible + "]";
	}
	
	


	
	
	



	
	
	
	
	
	
	
	

}
