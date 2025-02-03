package exercicios4;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1, num2, num3, aux;

		System.out.println("Informe um primeiro numero: ");
		num1 = teclado.nextInt();

		System.out.println("Informe um segundo numero: ");
		num2 = teclado.nextInt();

		System.out.println("Informe um terceiro numero: ");
		num3 = teclado.nextInt();

		if (num1 > num2) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}

		if (num2 > num3) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}

		if (num1 > num2) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}

		if (num2 > num3) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}
		teclado.close();

		System.out.println(num1 + " " + num2 + " " + num3);

		System.out.println("Tudo OK ;)");

		teclado.close();

	}
}