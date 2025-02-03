package fixacao;

import java.util.Scanner;

public class n2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner ( System.in);
		
		  int num1, cont, fatorial;

	        System.out.println("Informe um número: ");
	        num1 = (int) teclado.nextDouble();

	        while (num1 <= 0) {
	            System.out.println("Informe um número:");
	            num1 = teclado.nextInt();
	        }

	        cont = num1;
	        fatorial = 1;
	        while(cont>1){
	            fatorial = (fatorial * cont);
	            cont --;
	        }
	       
	        System.out.println(num1 + " ! é " + fatorial);
			
		teclado.close();
	}

}
