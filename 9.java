import java.util.Scanner;

public class Cambio
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite quantos reais deseja converter:");
		double reais = escanear.nextDouble();

		double taxa = 3.45;

		System.out.println(reais + "R$ vale " + reais * taxa + "$.");
		
	}
}