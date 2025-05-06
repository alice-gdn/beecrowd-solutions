package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double combustivel = sc.nextDouble();
		
		 double consumo = km/combustivel;
		
		System.out.printf("Consumo de combustivel por KM = %.3f%n ", consumo );
		
		sc.close();
	}

}
