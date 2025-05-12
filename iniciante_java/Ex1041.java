import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String quadrante = null;

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0) {
			quadrante = "Q1";
		} else if (x < 0 && y > 0) {
			quadrante = "Q2";
		} else if (x < 0 && y < 0) {
			quadrante = "Q3";
		} else {
			quadrante = "Q4";
		}

		if (x != 0 && y != 0) {
			System.out.println(quadrante);
		}
		
		if (y == 0 && x !=0) {
			System.out.println("Eixo X");
		}else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		}

		sc.close();
	}

}
