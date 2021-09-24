package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		// -- DECLARAMOS Y ASIGNAMOS --
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil mJuan = new Movil(4, "Iphone", 4, 111);
		Movil mMaria = new Movil(6, "Samsung", 5, 222);
		Movil mPedro = new Movil(8, "Huawei", 4, 333);
		Movil mBusqueda;
		int imei;
		Scanner sc = new Scanner(System.in);
		
		// -- POBLAMOS EL ARRAYLIST --
		moviles.add(mJuan);
		moviles.add(mMaria);
		moviles.add(mPedro);
		
		
		// -- MOSTRAMOS EL CONTENIDO DEL ARRAYLIST --
		System.out.println("CONTENIDO DEL ARRAYLIST");
		for(Movil movil : moviles) {
			System.out.println(movil);
		}
		
		
		
		// -- REALIZAMOS UNA BÚSQUEDA --
		System.out.println("IMEI: ");
		imei = sc.nextInt();
		
		sc.close();
		
		mBusqueda = new Movil();
		mBusqueda.setImei(imei);
		
		//HAY QUE REDEFINIR EN LA CLASE INCIO PORQUE SI SE HACE CON
		//EL IF, BUSCA POR LA DIRECCIÓN DE MEMORIA
		//SI REDEFINIMOS BUSCA POR LO INTRODUCIDO.
		
		if(moviles.contains(mBusqueda)) {
			System.out.println("Encontrado.");
		} else {
			System.out.println("No encontrado.");
		}

	}

}
