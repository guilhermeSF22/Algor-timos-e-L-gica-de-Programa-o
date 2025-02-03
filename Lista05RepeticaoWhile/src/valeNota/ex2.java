package valeNota;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n1, cont, fat;

		System.out.println("Informe um número: ");
		n1 = (int) teclado.nextDouble();

		while (n1 <= 0) {
			System.out.println("Informe um número:");
			n1 = teclado.nextInt();
		}

		cont = n1;
		fat = 1;
		while (cont > 1) {
			fat = (fat * cont);
			cont--;
		}

		System.out.println(n1 + " ! é " + fat);

		teclado.close();
	}

}
