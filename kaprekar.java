package kaprekar;

public class kaprekar {

	public static void main(String[] args) {

		int numero = 1121;

		int auxiliar = 0;
		int auxiliar2 = 0;
		int contador2 = 3;
		int superContador = 0;
		int d = 0;
		int c = 0;
		int b = 0;
		int a = 0;
		int sumaMayor_menor = 0;
		int sumaMenor_mayor = 0;

		while (numero != 6174) {
			// Separar el numero en digitos
			while (contador2 >= 0) {
				auxiliar = numero % 10;
				numero = numero / 10;

				if (contador2 == 3) {
					d = auxiliar;
				}
				if (contador2 == 2) {
					c = auxiliar;
				}
				if (contador2 == 1) {
					b = auxiliar;
				}
				if (contador2 == 0) {
					a = auxiliar;
				}

				contador2--;

			}
			contador2 = 3;

			System.out.println(d + "" + c + "" + b + "" + "" + a);

			// Ordenar el numero de menor a mayor

			if (a > b) {
				auxiliar2 = a;
				a = b;
				b = auxiliar2;
			}
			if (a > c) {
				auxiliar2 = a;
				a = c;
				c = auxiliar2;
			}
			if (a > d) {
				auxiliar2 = a;
				a = d;
				d = auxiliar2;
			}
			if (b > c) {
				auxiliar2 = b;
				b = c;
				c = auxiliar2;

			}
			if (b > d) {
				auxiliar2 = b;
				b = d;
				d = auxiliar2;
			}
			if (c > d) {
				auxiliar2 = c;
				c = d;
				d = auxiliar2;
			}

			d *= 1000;
			c *= 100;
			b *= 10;
			sumaMayor_menor = d + c + b + a;

			// ordenar el numero de mayor a menor

			d *= 0.001;
			c *= 0.1;
			b *= 10;
			a *= 1000;
			sumaMenor_mayor = d + c + b + a;

			numero = sumaMayor_menor - sumaMenor_mayor;
			superContador++;

		}
		System.out.println("Numero de iteraciones : " + superContador);
	}

}
