import java.util.Scanner;

public class Aumento
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		double valor = escanear.nextDouble();
		
		double promocao = valor * 0.15;
		
		System.out.println("O salário com aumento é: " + (valor + promocao) + "R$.");
	}
}