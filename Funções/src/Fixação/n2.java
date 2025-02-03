package Fixação;

import java.util.Scanner;

public class n2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String simbolo;
		System.out.println("Qual operação?");
		simbolo = teclado.next();
		while (simbolo.intern() != "+" && simbolo.intern() != "-" && simbolo.intern() != "*" && !simbolo.equals("/")) {
			System.out.println("Qual operação?");
			simbolo = teclado.next();
		}
		System.out.println("informe n1:");
		double n1 = teclado.nextInt();
		System.out.println("informe n2:");
		double n2 = teclado.nextInt();
		if (simbolo.intern() == "+") {
			double r = soma(n1,n2);
			System.out.println(r);
		}
		if (simbolo.intern() == "-") {
			double r = subtracao(n1,n2);
			System.out.println(r);
		}
		if (simbolo.intern() == "*") {
			double r = multiplicacao(n1,n2);
			System.out.println(r);
		}
		if (simbolo.intern() == "/") {
			double r = divisao(n1,n2);
			System.out.println(r);
			teclado.close();
		}

	}

	public static double soma(double n1, double n2) {
		double soma = n1 + n2;
		return soma;
	}

	public static double multiplicacao(double n1, double n2) {
		double multiplicacao = n1 * n2;
		return multiplicacao;
	}

	public static double divisao(double n1, double n2) {
		double divisao = n1 / n2;
		return divisao;
	}

	public static double subtracao(double n1, double n2) {
		double subtracao = n1 - n2;
		return subtracao;
	}
}
