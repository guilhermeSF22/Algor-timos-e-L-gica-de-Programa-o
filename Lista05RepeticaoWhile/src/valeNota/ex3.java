package valeNota;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = 0, cont = 1, num = 1;

		while (num1 <= 0) {
			System.out.println("Informe um número: ");
			num1 = teclado.nextInt();
		}

		while (cont != num1) {

			if (num1 % cont == 0) {
				num++;
			}

			cont++;

		}

		if (num == 2) {
			System.out.println("O número " + num1 + " é primo.");
		}

		else {
			System.out.println("O número " + num1 + " não é primo.");
		}

		teclado.close();
	}

}
