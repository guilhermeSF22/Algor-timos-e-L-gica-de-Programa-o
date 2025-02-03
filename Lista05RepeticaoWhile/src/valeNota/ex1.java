package valeNota;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n1, n2, resultado;

		System.out.println("Informe um número: ");

		n1 = teclado.nextInt();

		while (n1 <= 0) {

			System.out.println("Informe um número:");

			n1 = teclado.nextInt();

		}
		n2 = n1 * 2;

		resultado = n2;

		System.out.println("O dobro do número " + n1 + " é " + resultado);

		teclado.close();

	}
}
