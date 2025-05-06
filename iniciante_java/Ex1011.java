package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double r = sc.nextDouble();
		
		double volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
		
		System.out.printf("Volume = %.3f%n ", volume);
		
		sc.close();
		
		

	}

}
