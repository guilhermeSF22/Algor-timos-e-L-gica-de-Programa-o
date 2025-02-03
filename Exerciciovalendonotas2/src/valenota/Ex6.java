package valenota;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String mesNome;
		System.out.println("Qual o mes? ");
		mesNome = teclado.next();

		double kwhMes, kwhConsumo, tempo, dias, tarifa;

		System.out.println("Qual o total de kwh consumido em " + mesNome + " ?");
		kwhMes = teclado.nextDouble();

		System.out.println("Qual o consumo em kwh por mes do ar? ");
		kwhConsumo = teclado.nextDouble();

		System.out.println("Quanto tempo ele fica ligado diariamente? ");
		tempo = teclado.nextDouble();

		System.out.println("Quantos dias do mes ele ficou ligado?");
		dias = teclado.nextDouble();

		System.out.println("Qual a tarifa de energia por kwh? ");
		tarifa = teclado.nextDouble();

		Double mesDias, kwhDia, consumoMensal, kwhTotal, valor, porcentagem1, porcentagemFinal, conta;

		mesDias = 30.0;
		
		kwhDia = kwhConsumo / mesDias;
System.out.println("kwh no dia" + kwhDia);

		consumoMensal = tempo * dias;
System.out.println("horas ligadas no mes: " + consumoMensal);

		kwhTotal = (consumoMensal * kwhDia);
System.out.println("kwh no mes: "+ kwhTotal);

		valor = (kwhTotal * tarifa);
System.out.println("reais pagos ao mes" + valor);

		
		porcentagem1 = kwhTotal*100;
System.out.println("porcentagem decimal: "+porcentagem1);
		
		porcentagemFinal = porcentagem1/kwhMes;
System.out.println("porcentagem final: " + porcentagemFinal);

		conta = kwhMes * tarifa;

System.out.println("Em " + mesNome + " o ar condicionado consumiu "  + kwhTotal + " kwh por mês, totalizando " 
+ valor + " reais. Equivalente a " + porcentagemFinal + " % do total de " + conta + " reais de conta.");

System.out.println("Tudo OK ;)" );

		teclado.close();

	}

}
