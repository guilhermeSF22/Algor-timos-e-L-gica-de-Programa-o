package valeNota;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n = 5, m = 10;
		int[] R = new int[n];

		int[] S = new int[m];

		int[] X = new int[n];

		int i, tamX = 0, j;

		for (i = 0; i < n; i++) {
			R[i] = teclado.nextInt();
		}

		for (i = 0; i < m; i++) {
			S[i] = teclado.nextInt();
		}
		
		for (i = 0; i < n; i++) {
			boolean achou = false;
			for (j = 0; j < m; j++) {
				if (R[i] == S[j]) {
					achou = true;
					break;
				}
			}
			if (achou == true) {
				X[tamX] = R[i];
				tamX++;
			}
		}
		for (i = 0; i < tamX; i++) {

			System.out.print(X[i] + " ");

		}
		teclado.close();
	}
}
