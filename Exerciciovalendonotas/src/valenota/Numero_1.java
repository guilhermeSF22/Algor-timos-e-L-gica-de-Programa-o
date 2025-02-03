package valenota;

public class Numero_1 {
public static void main(String[] args) {
	

	double nota1, nota2, nota3, nota4, peso1, peso2, peso3, peso4, mp1, mp2,mp3, mp4;
		nota1=5.6;
		nota2=8.9;
		nota3=9.9;
		nota4=6.7;
		peso1=2.0;
		peso2=3.0;
		peso3=3.0;
		peso4=2.0;
		mp1 = (nota1*peso1);
		mp2 = (nota2*peso2);
		mp3 = (nota3*peso3);
		mp4 =(nota4*peso4);
		double mediaPonderada = ((mp1+mp2+mp3+mp4)/(peso1+peso2+peso3+peso4));
		
	System.out.println(mediaPonderada);
	System.out.println("Tudo OK ;)");
	}

}