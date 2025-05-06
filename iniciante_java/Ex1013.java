package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = (a + b + Math.abs(a - b)) / 2;
		
		if (c > maior) {
			maior = c;
		}
		System.out.println("Maior = " + maior);
		
		sc.close();
	}

}
