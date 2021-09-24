package paquete;

public class Curso {
	// -- CAMPOS o PROPIEDADES --
	// ¡OJO! Ahora los campos son privados.
	private String nombre;
	private String academia;
	private int horas;
	
	
	// -- CONSTRUCTORES --
	public Curso() {
		
	}
	
	public Curso(String n, String a, int h) { //ESTO NO LO ENTIENDO MUY BIEN. ¿Como llamar a SETTERS?
		this.nombre = n;
		this.academia = a;
		this.horas = h;
		
		setNombre(n);
		setHoras(h);
		setAcademia(a);
		
	}
	
	
	// -- MÉTODOS POR SER PRIVADOS LOS CAMPOS --
	
	// 1. Método SETTERS: Da los valores. Se pide como el constructor, pero aquí se pueden mostrar mensajes
		public void setNombre(String n) {
			String resp;
			 if(this.nombre.equals(" ")){
			 		resp = "Sin denominación";
			 } else {
			 		resp = this.nombre;
			 }
			 
			  this.nombre = n;
		}
			
			/*Si lo quiero devolver todo el mayúsculas:
			  return this.denominacion.toUpperCase();
			 */
			//this.nombre = n;
		

		public void setAcademia(String a) {
			this.academia = a;
		}


		public void setHoras(int h) {
			this.horas = h;
		}
		
	
	// 2. Método GETTERS: Lee el valor de un objeto. Se pueden poner casos dentro de cada método. Esto son ejemplos.
	public String getNombre() {
		/*String n;
		if(nombre.equalsIgnoreCase("Lengua")) {
			n = "El cuso lengua no existe.";
		} else {
			n = this.nombre.toUpperCase(); //Esto lo devuelve en mayúscula.
		}*/
		return nombre;
	}

	public String getAcademia() {
		return academia;
	}
	
	public int getHoras() {
		/*int resp;
		if (horas < 0) {
			System.out.println("Debes introducir un valor mayor a 0");
			resp = 0;
		} else {
			resp = this.horas;
		}*/
		return horas;
	}
	
	
	

	
	
	
	
}
