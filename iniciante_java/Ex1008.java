package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("Number = " + n);
		System.out.printf("Salary =  U$ %.2f ",salario);
		
		sc.close();
	}

}
