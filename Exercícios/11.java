import java.util.Scanner;

public class Delta
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de A:");
		double a = scan.nextDouble();
		System.out.println("Insira o valor de B:");
		double b = scan.nextDouble();
		System.out.println("Insira o valor de C:");
		double c = scan.nextDouble();
		
		double delta = (Math.pow(b, 2)) + 4 * a * c;
		
		System.out.println("O delta é: " + delta);
	}
}