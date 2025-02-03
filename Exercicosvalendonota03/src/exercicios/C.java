package exercicios;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double num1, num2;

		System.out.println("informe um numero: ");
		num1 = teclado.nextDouble();

		char operacao;
		System.out.println("Qual operacao matematica deseja realizar com eles? * / + - % ");
		operacao = teclado.next().charAt(0);

		System.out.println("informe o segundo numero: ");
		num2 = teclado.nextDouble();

		double resultado;

		if (operacao == '+') {
			resultado = num1 + num2;
		}

		else if (operacao == '-') {
			resultado = num1 - num2;
		}

		else if (operacao == '*') {
			resultado = num1 * num2;
		}

		else if (operacao == '/') {
			resultado = num1 / num2;
		}

		else if (operacao == '$') {
			resultado = num1 % num2;
		} else {
			System.out.println(" Operador nao reconhecido!!! ");
			return;
		}
		System.out.println(num1 + " " + operacao + " " + num2 + " = " + resultado);

		System.out.println(" Tudo OK ;)");

		teclado.close();

	}

}
