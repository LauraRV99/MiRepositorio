package clases;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class Pruebas {
	Coche coche = new Coche();
	int numeros1[] = {1,2,3};
	int numeros2[] = {1,0,3};
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//assertEquals(101, coche.acelerar(100)); //Afirmar que es igual
		//Esperamos que nos devuelva un 101 pasándole un 100.
		//Comprueba que el valor que le pasamos es igual al esperado.
		
		//assertTrue(coche.multa()); //Si devuelve falso no supera la prueba unitaria y sale rojo.
	
		assertArrayEquals(numeros1, numeros2); //Compara 2 arrays.
	}
	
	
	

}
