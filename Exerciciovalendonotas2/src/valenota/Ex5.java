package valenota;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double quantidadeLatao;
		System.out.println("Quantos kg de latão deseja produzir? ");
		quantidadeLatao = teclado.nextDouble();

		double lataoCobre;
		System.out.println("Qual a porcentagem de cobre no latao? ");
		lataoCobre = teclado.nextDouble();
		lataoCobre = lataoCobre / 100.0;

		double lataoZinco;
		System.out.println("Qual a porcentagem de zinco no latao? ");
		lataoZinco = teclado.nextDouble();
		lataoZinco = lataoZinco / 100.0;

		double quantidadeCobre, quantidadeZinco;

		quantidadeCobre = (lataoCobre * quantidadeLatao);
		System.out.println("quantidade de cobre necessaria: " + quantidadeCobre);

		quantidadeZinco = (lataoZinco * quantidadeLatao);
		System.out.println("quantidade de zinco necessaria: " + quantidadeZinco);

		System.out.println("Para " + quantidadeLatao + " kg de latao sera necessario " + quantidadeCobre
				+ "kg de cobre e " + quantidadeZinco + "kg de zinco.");

		System.out.println(" Tudo OK ;)");

		teclado.close();
		
	}

}
