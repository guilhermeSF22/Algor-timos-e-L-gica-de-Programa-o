package pe;

import java.util.Scanner;

public class PE {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] F = new int[6];
		int i, j, i2, j2;
		i = 0;
		j = 1;
		i2 = 1;
		j2 = 0;

		while (i < 5) {
			F[i] = j;
			j = j + 2;
			i = i + 2;
		}
		while (i2 < 6) {
			F[i2] = j2;
			j2 = j2 + 2;
			i2 = i2 + 2;
		}
		int somaP = 0, somaI = 0;
		// calcular soma de numeros pares e impares e imprimir;
		// transformar while para for;

		i = 0;
		while (i < 6) {

			System.out.println(F[i]);
			i++;

		}

	}

}
