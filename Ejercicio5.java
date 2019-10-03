package Boletin;

import java.util.Scanner;

//5. Leer por teclado dos tablas de 10 números enteros y
//mezclarlas en una tercera de la forma: el 1º de A, el 1º de
//B, el 2º de A, el 2º de B, etc.
public class Ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 arrays

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[20];

		Scanner esc = new Scanner(System.in);

		

		// recogida de numeros de A
		System.out.println("Intro 10 numeros enteros tabla A");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = esc.nextInt();
		}

		// recogida de numeros de B
		System.out.println("Intro 10 numeros enteros tabla B");
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = esc.nextInt();
		}
		
	
		//rellenar el arrayC
		for (int j = 0; j < arrayA.length; j++) {
			
			arrayC[2*j] = arrayA[j] ;
			arrayC[2*j+1] = arrayB[j] ;
			
		}
		// bucle para mostrar arrayC
				System.out.println("ARRAY C ");
				for (int i = 0;i<arrayC.length; i++) {
					System.out.print(" "+arrayC[i]);
				}
	}
}
