import java.util.Scanner;

public class Media
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite um numero real:");
		float num = escanear.nextFloat();

		System.out.println("O dobro de " + num + "é " + num * 2 + ".");
		System.out.println("A terça parte de " + num + " é " + num / 3 + ".");
	}
}