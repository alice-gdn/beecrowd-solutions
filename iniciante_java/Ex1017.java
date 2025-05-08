import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	int horasViagem = sc.nextInt();
	int kmHora = sc.nextInt();
	
	double consumo = (horasViagem * kmHora) / 12.0;
	
	System.out.printf("%.3f%n", consumo);
	
	sc.close();
	}

}
