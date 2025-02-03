package Fixação;

import java.util.Scanner;

public class n1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String simbolo;
		System.out.println("Qual operação?");
		simbolo = teclado.next();
		while (simbolo.intern() != "+" && simbolo.intern() != "-" && simbolo.intern() != "*" && !simbolo.equals("/")) {
			System.out.println("Qual operação?");
			simbolo = teclado.next();
		}
		if (simbolo.intern() == "+") {
			double r = soma();
			System.out.println(r);
		}
		if (simbolo.intern() == "-") {
			double r = subtracao();
			System.out.println(r);
		}
		if (simbolo.intern() == "*") {
			double r = multiplicacao();
			System.out.println(r);
		}
		if (simbolo.intern() == "/") {
			double r = divisao();
			System.out.println(r);
			teclado.close();
		}
		
	}

	public static double soma() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, soma;
		System.out.println("informe n1:");
		n1 = teclado.nextInt();
		System.out.println("informe n2:");
		n2 = teclado.nextInt();
		soma = n1 + n2;
		teclado.close();
		return soma;
	}

	public static double multiplicacao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2;
		System.out.println("informe n1:");
		n1 = teclado.nextInt();
		System.out.println("informe n2:");
		n2 = teclado.nextInt();
		double multiplicacao = n1 * n2;
		teclado.close();
		return multiplicacao;
	}

	public static double divisao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2;
		System.out.println("informe n1:");
		n1 = teclado.nextInt();
		System.out.println("informe n2:");
		n2 = teclado.nextInt();
		double divisao = n1 / n2;
		teclado.close();
		return divisao;
	}

	public static double subtracao() {
		Scanner teclado = new Scanner(System.in);
		double n1, n2;
		System.out.println("informe n1:");
		n1 = teclado.nextInt();
		System.out.println("informe n2:");
		n2 = teclado.nextInt();
		double subtracao = n1 - n2;
		teclado.close();
		return subtracao;
	}
}
