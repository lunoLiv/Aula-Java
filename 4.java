import java.util.Scanner;

public class Somar
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int n1 = escanear.nextInt();
		
		System.out.println("Digite outro número inteiro:");
		int n2 = escanear.nextInt();
		
		System.out.println("A soma de " + n1 + " " + n2 + " é igual a " + (n1+n2) + ".");
	}
}