package valeNota;

import java.util.Scanner;

public class ex3reciclado {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1 = 0, num2 = 0, result;

		while (num1 <= 0) {
			System.out.println("Informe um número positivo: ");
			num1 = teclado.nextInt();
		}

		System.out.println("Escolha um divisor: 2  3  5  7  9 ");
		num2 = teclado.nextInt();
		
		result = (num1 % num2);

		if (result >= 1) {

			System.out.println(num1 + " não é um número primo.");
		}
		else{System.out.println(num1 + " é um número primo");
		}
		;

		teclado.close();
	}

}
