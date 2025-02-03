package exercicios;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double num1, num2, resto1, resto2;

		System.out.println("informe um numero: ");
		num1 = teclado.nextInt();

		System.out.println("informe o segundo numero: ");
		num2 = teclado.nextInt();

		resto1 = num1 % num2;
		resto2 = num2 % num1;

		if (resto1 == 0) {
			System.out.println(num1 + " é multiplo de " + num2);
		} else {
			System.out.println(num1 + " é multiplo de " + num2);
		}

		if (resto2 != 0) {
		} else {
			System.out.println(num2 + " nao é multiplo de " + num1);
		}

		System.out.println(" Tudo OK ;) ");
		teclado.close();
	}

}