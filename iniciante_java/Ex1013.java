import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = (a + b + Math.abs(a - b)) / 2;
		
		if (c > maior) {
			maior = c;
		}
		
		System.out.println(maior + " eh o maior");
		
		sc.close();
	}

}
