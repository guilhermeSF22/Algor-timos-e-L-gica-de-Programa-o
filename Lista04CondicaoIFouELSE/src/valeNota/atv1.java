package valeNota;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		System.out.println("Quantos paes voce vai querer amigo?");

		double paes, custo=0.0;

		paes = teclado.nextDouble();


		if (paes < 12) {

		custo = 0.20 * paes;

		System.out.println(paes + " custarao " + paes*0.20);

		}

		else {

		System.out.println(paes + " custarao " + paes*0.15);

		}

		System.out.println("Tudo OK ;)");
		
		teclado.close();
	}

}
