package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double totalVendasMes = sc.nextDouble();
		
		double comissao = salario + (totalVendasMes * 0.15);
		
		System.out.println(nome);
		System.out.printf("Total = %.2f%n ", comissao);
		
		sc.close();
		

	}

}
