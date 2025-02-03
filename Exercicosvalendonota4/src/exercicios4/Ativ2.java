package exercicios4;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nome, signo = "";

		System.out.println("Qual o seu nome?: ");
		nome = teclado.nextLine();

		int dia, mes, ano;

		System.out.println("Qual dia voce nasceu? (30 dias): ");
		dia = teclado.nextInt();

		System.out.println("Qual mes voce nasceu? (0-12): ");
		mes = teclado.nextInt();

		System.out.println("Qual ano voce nasceu? (XXXX): ");
		ano = teclado.nextInt();

		if (dia >= 21 && mes == 3) {
			System.out.println("Aries. ");
		}
		if (dia < 21 && mes == 4) {
			signo = "Aries. ";
		}

		if (dia >= 21 && mes == 4) {
			System.out.println("Touro. ");
		}
		if (dia < 21 && mes == 5) {
			signo = "Touro. ";
		}

		if (dia >= 21 && mes == 5) {
			System.out.println("Gemeos. ");
		}
		if (dia < 21 && mes == 6) {
			signo = "Gemeos. ";
		}

		if (dia >= 21 && mes == 6) {
			System.out.println("Cancer. ");
		}
		if (dia < 21 && mes == 7) {
			signo = "Cancer. ";
		}

		if (dia >= 23 && mes == 7) {
			System.out.println("Leao. ");
		}
		if (dia < 23 && mes == 8) {
			signo = "Leão. ";
		}

		if (dia >= 23 && mes == 8) {
			System.out.println("Virgem. ");
		}
		if (dia < 23 && mes == 9) {
			signo = "Virgem. ";
		}

		if (dia >= 23 && mes == 9) {
			System.out.println("Libra. ");
		}
		if (dia < 23 && mes == 10) {
			signo = "Libra. ";
		}

		if (dia >= 23 && mes == 10) {
			System.out.println("Escorpiao. ");
		}
		if (dia < 23 && mes == 11) {
			signo = "Escorpião. ";
		}

		if (dia >= 22 && mes == 11) {
			System.out.println("Sagitario. ");
		}

		if (dia < 22 && mes == 12) {
			signo = "Sagitário. ";
		}

		if (dia >= 22 && mes == 12) {
			System.out.println("Capricornio. ");
		}
		if (dia < 22 && mes == 1) {
			signo = "Capricórnio. ";
		}

		if (dia >= 21 && mes == 1) {
			System.out.println("Aquario. ");
		}
		if (dia < 21 && mes == 2) {
			signo = "Aquário. ";
		}

		if (dia >= 19 && mes == 2) {
			System.out.println("Peixes. ");
		}
		if (dia < 19 && mes == 3) {
			signo = "Peixes. ";
		}

		System.out.println(nome + " é do signo de " + signo);

		System.out.println("Tudo OK ;)");
		
		teclado.close();

	}
}