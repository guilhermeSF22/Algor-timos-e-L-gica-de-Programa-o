package aula3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("informe um numero para multiplicarmos: ");
		num = teclado.nextInt();
		int resultado;
		resultado = (num * 0);
		System.out.println(num + " * 0 = " + resultado);
		
		resultado = (num * 1);
		System.out.println(num + " * 1 = " + resultado);
		
		resultado = (num * 2);
		System.out.println(num + " * 2 = " + resultado);
		
		resultado = (num * 3);
		System.out.println(num + " * 3 = " + resultado);
		
		resultado = (num * 4);
		System.out.println(num + " * 4 = " + resultado);
		
		resultado = (num * 5);
		System.out.println(num + " * 5 = " + resultado);
		
		resultado = (num * 6);
		System.out.println(num + " * 6 = " + resultado);
		
		resultado = (num * 7);
		System.out.println(num + " * 7 = " + resultado);
		
		resultado = (num * 8);
		System.out.println(num + " * 8 = " + resultado);
		
		resultado = (num * 9);
		System.out.println(num + " * 9 = " + resultado);
		
		resultado = (num * 10);
		System.out.println(num + " * 10 = " + resultado);
		
	System.out.println("tudo OK ;)");
		teclado.close();
		
		
	}

}
