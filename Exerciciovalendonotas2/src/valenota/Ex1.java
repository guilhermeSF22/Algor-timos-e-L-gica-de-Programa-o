package valenota;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double tempC;
		System.out.println("Informe a temperatura atual: ");
		tempC = teclado.nextDouble();
		System.out.println(tempC + " Celsius");
		double  tempF, tempK;
		tempF = ((tempC * 1.8) +32.0);
		System.out.println(tempF + " Fahrenheit");
		tempK = (tempC + 273);
		System.out.println(tempK + " Kelvin");
		
		System.out.println(tempC + " graus Celsius equivale a " + tempF + " graus Fahrenheit e " + tempK + " graus Kelvin.");
		
		System.out.println("tudo OK ;)");
		
		teclado.close();

	}

}
