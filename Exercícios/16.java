import java.util.Scanner;

public class Fumante {
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Quantos cigarros você fuma por dia?");
		int cigarros = escanear.nextInt();
		
		System.out.println("Quantos ano você fuma?");
		int anos = escanear.nextInt();
		
		double tempo = (((cigarros * 365 * anos) * 10) / 60) / 24;
		
		System.out.println("Tu perdeu " + tempo + " dias de vida!");

	}
}