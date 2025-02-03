package exercicios;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int dia, mes, ano;

		System.out.println("Qual dia voce nasceu? (30 dias): ");
		dia = teclado.nextInt();

		System.out.println("Qual mes voce nasceu? (12 meses): ");
		mes = teclado.nextInt();

		System.out.println("Qual ano voce nasceu? ");
		ano = teclado.nextInt();

		if (dia >= 23 && mes == 9) {
			System.out.println("Primavera. ");
		}

		if (mes == 10 || mes == 11) {
			System.out.println("Primavera. ");
		}

		if (dia <= 21 && mes == 12) {
			System.out.println("Primavera");
		}

		if (dia >= 21 && mes == 12) {
			System.out.println("Verao. ");
		}

		if (mes == 1 || mes == 2) {
			System.out.println("Verao. ");
		}

		if (dia <= 20 && mes == 3) {
			System.out.println("Verao");
		}

		if (dia >= 21 && mes == 3) {
			System.out.println("Outono. ");
		}

		if (mes == 4 || mes == 5) {
			System.out.println("Outono. ");
		}

		if (dia <= 21 && mes == 6) {
			System.out.println("Outono");
		}

		if (dia >= 22 && mes == 6) {
			System.out.println("Inverno. ");
		}

		if (mes == 7 || mes == 8) {
			System.out.println("Inverno. ");
		}

		if (dia <= 21 && mes == 9) {
			System.out.println("Inverno");
		}

		System.out.println("Tudo OK ;) ");

		teclado.close();

	}

}
