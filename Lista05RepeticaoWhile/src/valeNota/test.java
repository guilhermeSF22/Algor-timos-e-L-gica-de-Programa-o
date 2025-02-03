package valeNota;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int n, soma, i, num, j;
			boolean controle;
			Scanner teclado = new Scanner (System.in);
			n = -1;
			i = 1;
			soma = 0;
			while (n <= 0) {
			System.out.println("Informe um número positivo: "); n = teclado.nextInt();
			}
			while (i <= n) {
			num= -1;
			while (num <= 0) { System.out.println("Informe um " + i + " número positivo: "); num = teclado.nextInt();
			}
			controle = true;
			j = 2;
			while (j <= num / 2) {
			if (num % j == 0) {
			controle = false;
			}
			}
			if (controle) {
			soma += num;}
			i++;
			}System.out.print ("A soma de todos os número lidos é " + soma);
			if (soma % 2 == 1) {
			System.out.println(" e é impar");
			} else {
			System.out.println(" é par");
		
	}
			teclado.close();

}
			}
	
