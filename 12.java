import java.util.Scanner;

public class Desconto
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto:");
		double valor = escanear.nextDouble();
		
		double promocao = valor * 0.05;
		
		System.out.println("O valor promocional é: " + (valor - promocao) + "R$.");
	}
}