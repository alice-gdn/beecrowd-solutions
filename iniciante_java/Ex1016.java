import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);

		int km = sc.nextInt();
		int minutos = km * 2;
		
		System.out.println(minutos + " minutos");
		
		sc.close();
		
	}

}
