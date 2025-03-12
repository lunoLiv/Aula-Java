import java.util.Scanner;

public class Somar
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int num = escanear.nextInt();

		int antes = num - 1;
		int depois = num + 1;

		System.out.println("O antecessor de " + num + "é " + antes + ".");
		System.out.println("O sucessor de " + num + "é " + depois + ".");
	}
}