package exercicios;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double num, par, resultado;

		System.out.println("Informe um numero: ");
		num = teclado.nextDouble();

		if (num % 2 == 0) {
			System.out.println("O numero e par.");
		}

		else {
			System.out.println("O numero e impar.");
		}

		System.out.println("Tudo OK ;)");

		teclado.close();
	}

}
