import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] array = new double[3];
		
		for (int i = 0; i < 3; i++) {
			
			array[i] = sc.nextDouble();
		}
		
		Arrays.sort(array);
		
		double a, b, c;
		
		a = array[2];
		b = array[1];
		c = array[0];
		
		if (a >= (b+c)) {
			System.out.println("NAO FORMA TRIANGULO");
			
		}else if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO RETANGULO");
			
		}else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");
			
		}else if(Math.pow(a, 2) <(Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");
			
		}
		
		
		if (a == b && b ==c) {
			System.out.println("TRIANGULO EQUILATERO");
			
		}else if (a==b || b == c || c == a){
			System.out.println("TRIANGULO ISOSCELES");
		}

		sc.close();
	}

}
