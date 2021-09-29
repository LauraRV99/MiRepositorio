package clases;

import interfaz.IListado; // Hay que importarlo.
import java.util.ArrayList;

public class Listado implements IListado {

	// -- CAMPOS. --
	public ArrayList<Integer> listado = new ArrayList<Integer>();
	
	
	
	// -- CONSTRUCTORES. --
	public Listado(ArrayList<Integer> listado) {
		this.listado = listado;
	}
	
	public Listado() {
		
	}

	// -- MÉTODOS. --
	// Se crean automáticamente.
	@Override
	public void nuevo(int num) {
		// Para introducir un número nuevo.
		if(this.listado.size() == 18) {
			System.out.println("Listado lleno. No introducido.");
		} else if(this.listado.contains(num)) {
			System.out.println("Número ya encontrado. No introducido.");
		} else {
			this.listado.add(num); // Si no se encuentra el número o no está lleno, se añade esa persona al ArrayList.
			this.listado.sort(null);
		}
		
	}

	
	@Override
	public void listar() {
		// Para listar sólo es necesario el listado que se crea. Para ello, hay que recorrerlo.
		if(this.listado.size() == 0) {
			System.out.println("Listado vacío.");
		} else {
			System.out.println("Contenido del listado: ");
			for(int i = 0; i < listado.size(); i++) {
				System.out.println(this.listado.get(i)); // Lo que hace get es devolver el elemento del índice indicado.
			}
		}
		
	}

	@Override
	public void eliminar(int numero) {
		// Para eliminar un número, se necesita ese número.
		
		if(this.listado.contains(numero) == false) {
			System.out.println("Ese número no se encuentra en el listado.");
		} else {
			this.listado.remove(Integer.valueOf(numero));
		}
		
	}
	
	
	@Override
	public void eliminar() {
		// Elimina todo.
		if(this.listado.size() == 0) {
			System.out.println("Listado vacío.");
		} else {
			this.listado.clear();
			System.out.println("Listado eliminado.");
		}
		
	}

}
