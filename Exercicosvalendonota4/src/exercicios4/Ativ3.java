package exercicios4;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int diaBr, anoBr, horaBr, minBr, diaJp = 0, anoJp = 0, horaJp = 0, minJp = 0;

		String mesBr, mesJp = "";

		System.out.println("Qual a hora no Brasil?");

		horaBr = teclado.nextInt();

		System.out.println("Qual o min no Brasil?");

		minBr = teclado.nextInt();

		System.out.println("Qual o dia no Brasil?");

		diaBr = teclado.nextInt();

		System.out.println("Qual o mês no Brasil?");

		mesBr = teclado.next();

		System.out.println("Qual o ano no Brasil?");

		anoBr = teclado.nextInt();

		if (horaBr < 12) {

			horaJp = horaBr + 12;

			minJp = minBr;

			diaJp = diaBr;

			mesJp = mesBr;

			anoJp = anoBr;

		} else {

			horaJp = horaBr + 12 - 24;

			minJp = minBr;

			if (mesBr.equals("janeiro") || mesBr.equals("Janeiro")) {

				if (diaBr < 31) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "fevereiro";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("fevereiro")) {

				if (diaBr < 28) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "março";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("março")) {

				if (diaBr < 31) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "abril";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("abril")) {

				if (diaBr < 30) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "maio";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("outubro")) {

				if (diaBr < 31) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "novembro";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("novembro")) {

				if (diaBr < 30) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "dezembro";

					anoJp = anoBr;

				}

			}

			if (mesBr.equals("dezembro")) {

				if (diaBr < 31) {

					diaJp = diaBr + 1;

					mesJp = mesBr;

					anoJp = anoBr;

				} else {

					diaJp = 1;

					mesJp = "janeiro";

					anoJp = anoBr + 1;

				}

			}

		}

		System.out.println("No Japão: " + diaJp + "/" + mesJp + "/" + anoJp + " e " + horaJp + ":" + minJp);

		System.out.println("Tudo OK ;)");

	}

}
