package paquete;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		/*
		Programa que lee cantidades y precios de productos, para al final indicar el total de la
		factura. Si el importe supera los 1000€ se aplicará un descuento del 5%. El programa
		finaliza al introducir una cantidad 0.
		*/
		
		int cantidad;
		float precio;
		float pxc;
		float pFinal = 0;
		float pDesc = 0;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dame una cantidad: ");
			cantidad = sc.nextInt();
			
			if(cantidad == 0) {
				continuar = false;
			}
			else {
				System.out.print("Dame un precio: ");
				precio = sc.nextFloat();
				
				pxc = cantidad*precio;
				pFinal = pFinal + pxc;
			}
			
			if(pFinal > 1000) {
				pDesc = (float) (pFinal - (pFinal*0.05));
			}
			
		} while(continuar);
		
		sc.close();
		
		if(pFinal > 1000) {
			System.out.println("El precio final es " + pFinal + " y aplicándole el descuento es " + pDesc);
		} 
		else {
			System.out.println("El precio final es " + pFinal);
		}
	}

}
