package exercicios4;

import java.util.Scanner;

public class Ativ5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1, num2, num3, num4, aux;

		System.out.println("Insira um numero:");
		num1 = teclado.nextInt();

		System.out.println("Insira um numero:");
		num2 = teclado.nextInt();

		System.out.println("Insira um numero:");
		num3 = teclado.nextInt();

		System.out.println("Insira um numero:");
		num4 = teclado.nextInt();

		if (num1 > num2) {
			aux = num2;
			num2 = num1; // n2 = 4
			num1 = aux; // n1 = 3
		} // 3 4 2 1

		if (num2 > num3) {
			aux = num3;
			num3 = num2; // n3 = 4
			num2 = aux; // n2 = 2
		} // 3 2 4 1

		if (num3 > num4) {
			aux = num4;
			num4 = num3;
			num3 = aux;
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

		if (num1 > num2) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

		System.out.println("Tudo OK ;)");

		teclado.close();

	}
}