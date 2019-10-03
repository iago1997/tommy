package Boletin;

import java.util.Scanner;

//1. Leer 5 números y mostrarlos en el mismo orden
//introducido.
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner esc=new Scanner(System.in);
		// array de cinco posiciones
		int[] numeros = new int[5];
		// bucle para leer los numeros
		System.out.println("Intro 5 numeros enteros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=esc.nextInt();
		}
		System.out.println("Muestro 5 numeros enteros");
		// bucle para mostrarlos
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" "+numeros[i]);
		}

	}

}
