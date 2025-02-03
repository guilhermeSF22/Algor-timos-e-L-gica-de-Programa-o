package aula3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double peso, altura, imc;
	System.out.println("Qual o seu peso?" );

		peso = teclado.nextDouble();

	System.out.println("qual a sua altura? ");
	
		altura = teclado.nextDouble();
		
		imc = peso/(altura*altura);
		
	System.out.println("seu imc e " + imc);
	System.out.println("Tudo OK ;)");
		teclado.close();
		
		
	}

}
