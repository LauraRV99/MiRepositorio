package paquete;

public class Alumno {
	/* 
	 Se declara la clase Alumno. En este bloque se encuentran:
	 	- Los campos o propiedades de la clase, variables.
	 	- Los métodos, funciones.
	 */
	
	// -- DECLARACIÓN DE LOS CAMPOS. --
	/* Los campos puedes ser públicos, privados o protected.
	   Públicos: se puede heredar y acceder desde el objeto.
	   Privados: lo contrario a público.
	   Protected: mezcla público y privado. Se puede heredar pero no acceder desde el objeto.
	 */
	public String nombre; 
	public String apellido1;
	public String apellido2;
	
	
	// -- CONSTRUCTORES --
	public Alumno() {
		//Constructor vacío.
	}
	
	
	public Alumno(String n, String ap1, String ap2) {
		//Su función es inicializar el objeto.
		//Se tiene que llamar igual que la clase.
		//Puede estar o no vacío.
		
		//Una vez que pasen los valores a través de los parámetros de los paréntesis, se asigna el valor al campo.
		//Si los parámetros () NO se llaman igual que los campos, se puede no poner this. como se observa con apellido2
		this.nombre = n;
		this.apellido1 = ap1;
		apellido2 = ap2;
	}
	
	
	
	// -- MÉTODOS --
	// 1. Método que no devuelve nada, simplemente muestran por pantalla.
	public void mostrar() {
		//void significa vacío, es decir, que no devuelve nada.
		
		String mensaje; //mensaje es una variable local que SÓLO se puede usar dentro del método en el que se declara.
		
		mensaje = "NOMBRE: " + this.nombre + "\n"
				+ "APELLIDO 1: " + this.apellido1 + "\n"
				+ "APELLIDO 2: " + this.apellido2 + "\n";
		
		//this. se pone cuando nos referimos a los campos.
		
		System.out.println(mensaje);
	}
	
	
	// 2. Método que muestra un valor.
	 public int sumarNotas(int n1, int n2){
		 int suma;
		 	
		 suma = n1 + n2;
		 	
		 return suma;
	 }

}
