package exercicios4;

import java.util.Scanner;

public class Ativ32 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int horasBr, horasJp, minutosBr, minutosJp, diaBr, diaJp, anoBr, anoJp;
		
		System.out.println("Informe a hora: (0-24h) ");
		horasBr = teclado.nextInt();

		System.out.println("Informe os minutos: (0-60 min)");
		minutosBr = teclado.nextInt();

		System.out.println("Informe o dia: ");
		diaBr = teclado.nextInt();

		System.out.println("Informe o ano: ");
		anoBr = teclado.nextInt();

		String mesBr, mesJp;

		System.out.println("Informe o mes: (extenso)");
		mesBr = teclado.nextLine();

		if (horasBr < 12) {

			horasJp = horasBr + 12;

			minutosJp = minutosBr;

			diaJp = diaBr;

			mesJp = mesBr;

			anoJp = anoBr;
		}else {
			horasJp = (horasBr + 12 - 24);
		}
		minutosJp = minutosBr;

		if (mesB.equals("janeiro") || mesB.equals("Janeiro")) {

			if (diaB < 31) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJp = "fevereiro";

				anoJ = anoB;

			}

		}

		if (mesB.equals("fevereiro")) {

			if (diaB < 28) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJp = "março";

				anoJ = anoB;

			}

		}

		if (mesB.equals("março")) {

			if (diaB < 31) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJp = "abril";

				anoJ = anoB;

			}

		}

		if (mesB.equals("abril")) {

			if (diaB < 30) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJp = "maio";

				anoJ = anoB;

			}

		}

		if (mesB.equals("outubro")) {

			if (diaB < 31) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJp = "novembro";

				anoJ = anoB;

			}

		}

		if (mesB.equals("novembro")) {

			if (diaB < 30) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJ = "dezembro";

				anoJ = anoB;

			}

		}

		if (mesB.equals("dezembro")) {

			if (diaB < 31) {

				diaJ = diaB + 1;

				mesJp = mesB;

				anoJ = anoB;

			} else {

				diaJ = 1;

				mesJ = "janeiro";

				anoJ = anoB+1;

			}

		}



	}



	// 4º passo imprimir o resultado

	System.out.println("No Japão: " + diaJ + "/" + mesJ + "/" + anoJ + " e " + horaJ + ":" + minJ);
		

		teclado.close();

	}
}