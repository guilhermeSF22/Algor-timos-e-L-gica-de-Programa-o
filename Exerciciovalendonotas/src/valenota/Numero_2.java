package valenota;

public class Numero_2 {

	public static void main(String[] args) {
		int segundosOriginal, segundos, minutos, horas, resto;
		segundosOriginal = 3666;
		System.out.println(segundosOriginal);
		
		horas = (segundosOriginal/3600);
	System.out.println("horas: "+horas);
	
	resto = segundosOriginal%3600;


	minutos = resto/60;
System.out.println("minutos: "+minutos);

		segundos = (resto%60);
		
	System.out.println("Segundos: "+segundos);
	System.out.println("resto: "+ resto);
	
System.out.println("OK ;)");
		
		

	}

}
