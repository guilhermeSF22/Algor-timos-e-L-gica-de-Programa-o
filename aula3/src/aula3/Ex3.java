package aula3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;
		int dia, mes, ano1, ano;
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Informe o ano atual: ");
		ano1 = teclado.nextInt();
		System.out.println("data de nascimento: ");
		dia = teclado.nextInt();
		mes = teclado.nextInt();
		ano = teclado.nextInt();
		System.out.println(dia + "/" + mes + "/" + ano);
		int anos2;
		anos2 = (ano1 - ano);
		System.out.println(nome + " possui completa idade de "+ anos2);
System.out.println();
		teclado.close();
		
	}

}
