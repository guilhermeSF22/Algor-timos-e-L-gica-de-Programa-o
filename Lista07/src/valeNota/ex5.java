package valeNota;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[] Q = new double[10];

		double[] P = new double[10];
		int i = 0;

		for (i = 0; i < 10; i++) {
			Q[i] = teclado.nextDouble();
		}

		for (i = 0; i < 10; i++) {
			P[i] = teclado.nextDouble();
		}
		double soma = 0;

		for (i = 0; i < 10; i++) {
			soma = (Q[i] * P[i]) + soma;

		}
		System.out.println(soma);
	}

}
