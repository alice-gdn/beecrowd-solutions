import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario = sc.nextDouble();
		double percReajuste = 0;
		
		if (salario > 0 && salario <= 400) {
		percReajuste = 15.0/100;
				
		}else if (salario <= 800){
		percReajuste = 12.0/100;
		
		}else if (salario <= 1200) {
		percReajuste = 10.0/100;
		
		}else if(salario <=2000) {
		percReajuste = 7.0/100;
		
		}else {
			percReajuste = 4.0/100;
		}
		
		double reajuste = salario * percReajuste;
		salario += reajuste;
		
		System.out.printf("Novo salario: %.2f%n", salario );
		System.out.printf("Reajuste ganho: %.2f%n", reajuste );
		System.out.println("Em percentual: "+ (int) (percReajuste * 100) + " %");
		
		sc.close();
	}
	
}
