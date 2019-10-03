package Boletin;

import java.util.Arrays;
import java.util.Scanner;

//8. Diseñar una aplicación que declare una tabla de 10
//elementos enteros. Leer mediante el teclado 8 números.
//Después se debe pedir un número y una posición, insertarlo
//en la posición indicada, desplazando los que estén detrás.

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor=0;
		int indice=0;
		int[] original = new int[10];
		int[] auxiliar = new int[10];
		Scanner esc = new Scanner(System.in);

		// recogida de numeros hasta 8
		System.out.println("Intro 8 numeros enteros tabla original");
		for (int i = 0; i < 8; i++) {
			original[i] = esc.nextInt();
		}
		
		System.out.println(Arrays.toString(original));
		
		
		System.out.println("introduce un valor entero");
		valor=esc.nextInt();
		System.out.println("indica indice para insertar[0-9]");
		indice=esc.nextInt();
		
		//anteriores al indice
		for(int i=0;i<indice;i++) {
			auxiliar[i]=original[i];
		}
		
		
		//insertamos el valor en la posicion del indice
		auxiliar[indice]=valor;
		
		//posteriores al indice
		for(int i=indice+1;i<auxiliar.length-1;i++) {
				auxiliar[i]=original[i-1];
			}
		
	
		
		//recuperar el nombre original
		original=auxiliar;
		System.out.println(Arrays.toString(original));
	}

}
