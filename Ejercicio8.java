package Boletin;

import java.util.Arrays;
import java.util.Scanner;

//8. Dise�ar una aplicaci�n que declare una tabla de 10
//elementos enteros. Leer mediante el teclado 8 n�meros.
//Despu�s se debe pedir un n�mero y una posici�n, insertarlo
//en la posici�n indicada, desplazando los que est�n detr�s.

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
