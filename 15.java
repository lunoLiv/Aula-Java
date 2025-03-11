import java.util.Scanner;

public class Trabalho
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Quantos dias você trabalhou esse mês?");
		double dias = escanear.nextDouble();
		
		System.out.println("O seu salário será de: " + dias * 8 * 25 + "R$.");
	}
}