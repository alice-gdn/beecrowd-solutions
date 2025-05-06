package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de media");
		
		System.out.print("Digite a primeira nota:  ");
		double a = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double b = sc.nextDouble();
		
		double media = (a + b) / 2;
		
		System.out.println("Media = " + media );

		sc.close();
	}

}
