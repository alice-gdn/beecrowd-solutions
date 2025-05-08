import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadeDias = sc.nextInt();
		
		System.out.println(idadeDias / 365 + " ano(s)");
		idadeDias = idadeDias % 365;
		
		System.out.println(idadeDias / 30 + " mes(es)");
		idadeDias = idadeDias % 30;
		
		System.out.println(idadeDias + " dia(s)");
		
		sc.close();
		
	}

}
