import java.util.Scanner;

public class Somar
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite a 1º nota:");
		int n1 = escanear.nextInt();
		
		System.out.println("Digite a 2º nota:");
		int n2 = escanear.nextInt();
		
		double media = (n1 + n2) / 2;
		
		System.out.println("A média do aluno é: " +  media + ".");
	}
}