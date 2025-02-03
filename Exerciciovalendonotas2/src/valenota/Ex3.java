package valenota;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;
		System.out.println("Qual o nome do produto? ");

		nome = teclado.next();

		System.out.println("nome: " + nome);

		double valor;

		System.out.println("Qual o valor do produto? ");

		valor = teclado.nextDouble();

		System.out.println("valor" + valor);

		double porcento;

		System.out.println("Qual a porcentagem de lucro? ");

		porcento = teclado.nextDouble();

		System.out.println("porcentagem: " + porcento);

		double gasto = 100 - porcento;

		double resultado;

		resultado = valor * 100;

		System.out.println("resultado: " + resultado);

		resultado = resultado / gasto;

		System.out.println("resultado preço = " + resultado);

		System.out.println("O " + nome + " que tem preço de custo de " + valor + " deve ser vendido por: " + resultado);

		System.out.println("Está OK ;)");

		teclado.close();

	}

}
