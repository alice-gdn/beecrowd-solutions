import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigo1 = sc.nextInt();
		int qtdPecas1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int qtdPecas2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = qtdPecas1 * valor1 + qtdPecas2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
		
		
	}

}
