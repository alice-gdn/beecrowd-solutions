import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();

		int duracao = 0;

		if (inicio >= fim) {
			duracao = (24 - inicio) + fim;
		} else {
			duracao = fim - inicio;
		}

		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
		sc.close();
	}

}
