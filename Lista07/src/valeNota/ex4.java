package valeNota;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] R = new int[10];

		int[] S = new int[20];

		int[] X = new int[10];
		int i = 0;
		for (i = 0; i < 10; i++) {
			R[i] = teclado.nextInt();
		}

		for (i = 0; i < 20; i++) {
			S[i] = teclado.nextInt();
		}

		boolean interseccao;
		int tamX = 0;
		for (i = 0; i < 10; i++) {
			for (int J = 0; J < 20; J++) {
				if (R[i] == S[J]) {
					interseccao = false;
					for (int K = 0; K < tamX; K++) {
						if (X[K] == R[i]) {
							interseccao = true;
							break;
						}
					}
					if (interseccao == false) {
						X[tamX] = R[i];
						tamX++;
					}
					break;
				}
			}
		}

		for (i = 0; i < tamX; i++) {

			System.out.print(X[i] + " ");

		}
		teclado.close();
	}

}
