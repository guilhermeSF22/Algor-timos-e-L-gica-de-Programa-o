package valeNota;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] r = new int[10];
		int[] s = new int[20];
		int[] x = new int[30];

		int i, tamX = 0, j;
		boolean achou;

		for (i = 0; i < 10; i++) {
			System.out.println("R[" + i + "]:");
			r[i] = teclado.nextInt();
		}
		for (i = 0; i < 20; i++) {
			System.out.println("s[" + i + "]:");
			s[i] = teclado.nextInt();
		}

		for (i = 0; i < 10; i++) {
			if (i == 0) {
				x[tamX] = r[i];
				tamX++;
			} else {
				achou = false;
				for (j = tamX - 1; j >= 0; j--) {
					if (x[j] == r[i]) {
						achou = true;
					}
				}
				if (achou == false) {
					x[tamX] = r[i];
					tamX++;
				}
			}
		}
		for (i = 0; i < 20; i++) {
			achou = false;
			for (j = tamX - 1; j >= 0; j--) {
				if (x[j] == r[i]) {
					achou = true;
				}
			}
			if (achou == false) {
				x[tamX] = r[i];
				tamX++;
			}

		}

	}

}
