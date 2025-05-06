package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double triangulo = (a * c) / 2;
		double circulo = Math.PI * Math.pow(c, 2);
		double trapezio = ((a + b) * c ) / 2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		
		System.out.printf(" Triangulo = %.3f%n ", triangulo);
		System.out.printf(" Circulo = %.3f%n ", circulo);
		System.out.printf(" Trapezio = %.3f%n ", trapezio);
		System.out.printf(" Quadrado = %.3f%n ", quadrado);
		System.out.printf(" Retangulo = %.3f%n ", retangulo);
		
		sc.close();
	}

}
