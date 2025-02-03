package valenota;

import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		Double valor;
		valor = 55.78;
		System.out.println("Total da compra: "+valor);
		double  n1, n2, n3, n4, v1, v2, v3, v4, t1, t2, t3, t4;
		n1=4;
		n2=2;
		n3=2;
		n4=2;
		v1=2;
		v2=5;
		v3=10;
		v4=20;
		t1=(n1*v1);
	System.out.println("valor das notas: "+t1);
		t2=(n2*v2);
	System.out.println("valor das notas: "+t2);
		t3=(n3*v3);
	System.out.println("valor das notas: "+t3);
		t4=(n4*v4);
	System.out.println("valor das notas: "+t4);
	System.out.println("Aqui esta seu troco: "+((t1+t2+t3+t4)-valor));
	teclado.close();
	System.out.println("ok ; )");
		
		
	}

}
