import java.util.Scanner;

public class Tinta
{
	public static void main(String[] args)
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Digite a largura:");
		double largura = escanear.nextDouble();

		System.out.println("Digite a altura:");
		double altura = escanear.nextDouble();
		
		double perimetro = largura * altura;
		
		double tinta = perimetro / 2;

		System.out.println("Você precisa de " + tinta + "L de tinta para pintar " + perimetro + ".");
		
	}
}