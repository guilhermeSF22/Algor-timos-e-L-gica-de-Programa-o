package valeNota;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcao, n, cont;

		opcao = 1;

		while (opcao != 0) {

			System.out.println("Digite");

			System.out.println("1-Média Aritmética");

			System.out.println("2-Fatorial");

			System.out.println("3-Par ou ímpar");

			System.out.println("4-Primo");

			System.out.println("0-sair");

			opcao = teclado.nextInt();
			System.out.println(opcao);

			if (opcao == 1) {

				System.out.println("Informe N:");

				n = teclado.nextInt();

				cont = 1;

				int soma = 0;

				while (cont <= n) {

					System.out.println("Informe o "

							+ cont + "º número:");

					int num = teclado.nextInt();

					soma = soma + num;

					cont++;

				}

				double media = soma / n;

				System.out.println("A média é:" + media);

			} else {

				if (opcao == 2) {
					int n1, cont2, fat;
					System.out.println("Informe um número: ");
					n1 = (int) teclado.nextDouble();

					while (n1 <= 0) {
						System.out.println("Informe um número:");
						n1 = teclado.nextInt();
					}

					cont2 = n1;
					fat = 1;
					while (cont2 > 1) {
						fat = (fat * cont2);
						cont2--;
					}

					System.out.println(n1 + " ! é " + fat);

				} else {

					if (opcao == 3) {

						int n1;

						System.out.println("Informe um número: ");

						n1 = teclado.nextInt();

						while (n1 <= 0) {

							System.out.println("Informe um número:");

							n1 = teclado.nextInt();

						}

						if (n1 % 2 == 0) {

							System.out.println(n1 + " é um numero par.");

						} else {

							System.out.println(n1 + " é um numero impar.");
						}

					} else {

						if (opcao == 4) {
							int num1 = 0, cont2 = 1, num = 1;

							while (num1 <= 0) {
								System.out.println("Informe um número: ");
								num1 = teclado.nextInt();
							}

							while (cont2 != num1) {

								if (num1 % cont2 == 0) {
									num++;
								}

								cont2++;

							}

							if (num == 2) {
								System.out.println("O número " + num1 + " é primo.");
							}

							else {
								System.out.println("O número " + num1 + " não é primo.");
							}

						} else {

							if (opcao != 0) {

								System.out.println("Opção inválida");

							}

						}
						if (opcao == 0) {
							System.out.println("Programa finalizado.");
						}

					}

				}

			}

		}
		teclado.close();
	}
}
