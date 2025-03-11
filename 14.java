import java.util.Scanner;

public class Cobrar
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Quantos Km você já percorreu?");
		double km = escanear.nextDouble();
		
		System.out.println("Quantos dias você alugou?");
		double dias = escanear.nextDouble();
		
		System.out.println("O total que você deve pagar é: " + ((km * 0.20) + (dias * 90)) + "R$.");
	}
}