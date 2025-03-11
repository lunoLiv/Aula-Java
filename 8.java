import java.util.Scanner;

public class Medidas
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite uma distância em metros:");
		double metros = escanear.nextDouble();

		System.out.println("A distância de " + metros + "m em KM é: " + metros / 1000 + ".");
		System.out.println("A distância de " + metros + "m em Hm é: " + metros / 100 + ".");
		System.out.println("A distância de " + metros + "m em Dam é: " + metros / 10 + ".");
		
		System.out.println("A distância de " + metros + "m em dm é: " + metros * 10 + ".");
		System.out.println("A distância de " + metros + "m em cm é: " + metros * 100 + ".");
		System.out.println("A distância de " + metros + "m em mm é: " + metros * 1000 + ".");
		
	}
}