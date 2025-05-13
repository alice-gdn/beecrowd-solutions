import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		
		if ((a + b) > c && (b + c) > a && (a + c) > b) {
			
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else {
			double area = (a + b) * ( c/2);
			
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}

}
