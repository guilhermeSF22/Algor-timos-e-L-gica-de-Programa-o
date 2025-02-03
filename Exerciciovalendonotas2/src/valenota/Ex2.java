package valenota;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double area1, area2;
		System.out.println("Informe a largura do terreno: ");
		area1 = teclado.nextDouble();
		System.out.println("Informe o comprimento do terreno: ");
		area2 = teclado.nextDouble();
		
		
		double  total;
		total = (area1 * area2);
		System.out.println("total = "+ total);
		
		System.out.println("O terreno " + area1 + " X " + area2 + " tem " + total + " metros quadrados.");
		
		System.out.println("tudo OK ;)");
		
		teclado.close();
		
	}

}
