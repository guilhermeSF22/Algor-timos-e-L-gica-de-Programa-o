package pe;

import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] F = new int[6];
		int i, j, i2, j2;
		i = 0;
		j = 1;
		i2 = 1;
		j2 = 0;

		for (i=0; i < 5; i+=2) {
			F[i] = j;
			j = j + 2;
			i = i + 2;
		}
		while (i2 < 6) {
			F[i2] = j2;
			j2 = j2 + 2;
			i2 = i2 + 2;
		}
		int somaP = 0, somaI = 0;

		i = 0;
		for (i=0; i < 6; i++){
			if (F[i] % 2 == 0) {
				System.out.println("par" + F[i]);
				somaP = (somaP + F[i]);
			} else {
				System.out.println("impar" + F[i]);
				somaI = (somaI + F[i]);
			}
	
		}
		System.out.println(somaP);
		System.out.println(somaI);
	}

}
