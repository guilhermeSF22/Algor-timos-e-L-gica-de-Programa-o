package valenota;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;
		System.out.println("Qual o nome do fumante? ");
		nome = teclado.next();
		System.out.println("nome: " + nome);

		double anos;
		System.out.println("Quantos anos " + nome + " fumou?");
		anos = teclado.nextDouble();
		System.out.println("anos: " + anos);

		double cigarros;
		System.out.println("Qual a quantidade média de cigarros por dia? ");

		cigarros = teclado.nextDouble();
		System.out.println("media de cigarros: " + cigarros);

		double valorCarteira;
		System.out.println("Qual o preço médio de cada carteira? ");
		valorCarteira = teclado.nextDouble();
		System.out.println("valor da carteira: " + valorCarteira);

		double undcarteira, precoCigarro, mes, ano, anos1, valorDiario, valorMensal, valorTotal;

		mes = 30.0;
		
		ano = 12.0;

		anos1 = (ano * mes) * anos;
		System.out.println("dias totais de fumar: " + anos1);

		undcarteira = 20.0;

		precoCigarro = (valorCarteira / undcarteira);
		System.out.println("valor por cigarro:" + precoCigarro);

		valorDiario = (cigarros * precoCigarro);
		System.out.println("reais gastos por dia: " + valorDiario);

		valorMensal = (valorDiario * mes);
		System.out.println("reais gastos por mes: " + valorMensal);

		valorTotal = valorMensal * (anos * ano);
		System.out.println("valor por anos: " + valorTotal);

		System.out.println(nome + "ja gastou um total de " + valorTotal + " reais.");

		System.out.println(" Tudo OK ;)");

		teclado.close();
	}

}
