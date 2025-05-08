import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double valor = sc.nextDouble();

		System.out.println("NOTAS:");

		int qtd = (int) valor / 100;
		System.out.println(qtd + " nota(s) de R$ 100.00");
		valor -= 100 * qtd;

		qtd = (int) valor / 50;
		System.out.println(qtd + " nota(s) de R$ 50.00");
		valor -= 50 * qtd;

		qtd = (int) valor / 20;
		System.out.println(qtd + " nota(s) de R$ 20.00");
		valor -= 20 * qtd;

		qtd = (int) valor / 10;
		System.out.println(qtd + " nota(s) de R$ 10.00");
		valor -= 10 * qtd;

		qtd = (int) valor / 5;
		System.out.println(qtd + " nota(s) de R$ 5.00");
		valor -= 5 * qtd;

		qtd = (int) valor / 2;
		System.out.println(qtd + " nota(s) de R$ 2.00");
		valor -= 2 * qtd;

		System.out.println("MOEDAS:");

		qtd = (int) valor;
		System.out.println(qtd + " moeda(s) de R$ 1.00");
		valor -= qtd;

		// multiplicando valor por 100 para facilitar
		valor *= 100;

		qtd = (int) valor / 50;
		System.out.println(qtd + " moeda(s) de R$ 0.50");
		valor -= 50 * qtd;

		qtd = (int) valor / 25;
		System.out.println(qtd + " moeda(s) de R$ 0.25");
		valor -= 25 * qtd;

		qtd = (int) valor / 10;
		System.out.println(qtd + " moeda(s) de R$ 0.10");
		valor -= 10 * qtd;

		qtd = (int) valor / 5;
		System.out.println(qtd + " moeda(s) de R$ 0.05");
		valor -= 5 * qtd;

		qtd = (int) valor;
		System.out.println(qtd + " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
