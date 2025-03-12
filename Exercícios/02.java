import java.util.Scanner;

public class BemVindo
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = escanear.nextLine();
		
		System.out.println("Seja bem-vindo " + nome + "!");
	}
}