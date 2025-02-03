package valeNota;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] B = new int[10];

		int[] B2 = new int[10];

		int[] X = new int[10];

		int i, j, tamX = 0;

		for (i = 0; i < 10; i++) {
			B[i] = teclado.nextInt();
			B2[i] = B[i];
		}

		for (i = 0; i < 10; i++) {
			int cont = 0;
			for (j = 0; j < 10; j++) {
				if (B[i] == B2[j]) {
					cont++;
				}
			}
			if (cont == 1) {
				X[tamX] = B[i];
				tamX++;
			}
		}
		for (i = 0; i < tamX; i++) {

			System.out.print(X[i] + " ");
		}
		teclado.close();
	}
}
