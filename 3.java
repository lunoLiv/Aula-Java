import java.util.Scanner;

public class ListarFuncionario
{
	public static void main(String[] args) 
	{
		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Qual o nome do funcionário?");
		String nome = escanear.nextLine();
		
		System.out.println("Qual o salário do funcionário?");
		double salario = escanear.nextDouble();
		
		System.out.println("Nome do funcionário: " + nome + ".");
		System.out.println("Salário do funcionário: " + salario + ".");
		System.out.println("O funcionário " + nome + "tem um salário de R$" + salario + " em Março.");
	}
}