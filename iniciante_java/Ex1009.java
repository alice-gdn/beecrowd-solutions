import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double totalVendasMes = sc.nextDouble();
		
		double comissao = salario + (totalVendasMes * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", comissao);
		
		sc.close();
		

	}

}
