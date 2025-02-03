package exercicios4;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quantos paes voce vai querer amigo?");
		double paes, custo;
		
		paes = teclado.nextDouble();
		custo = 0.0;
		
		if (paes < 12) {
			custo = 0.20 * paes;
			System.out.println(paes + " custarao " + paes*0.20);
		}
		else {
			System.out.println(paes + " custarao " + paes*0.15);
		}
		System.out.println("Tudo OK ;)");
	}
}