package fixacao;

import java.util.Scanner;

public class n1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1, num2;

		System.out.println("Informe um número: ");

		num1 = teclado.nextInt();

		while (num1 <= 0) {

			System.out.println("Informe um número:");

			num1 = teclado.nextInt();

		}

		num2 = (num1 * 2);

		System.out.println("O dobro do número " + num1 + " é " + num2);

		if (num2 % 2 == 0) {

			System.out.println(num2 + " é um numero par.");

		} else {

			System.out.println(num2 + " é um numero impar.");

			teclado.close();
		}

	}
}