import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double combustivel = sc.nextDouble();
		
		 double consumo = km/combustivel;
		
		System.out.printf("%.3f km/l%n", consumo);
		
		sc.close();
	}

}
