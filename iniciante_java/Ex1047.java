import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int horaIni = sc.nextInt();
		int minIni = sc.nextInt();
		int horaFim = sc.nextInt();
		int minFim = sc.nextInt();
		
		int inicio = horaIni * 60 + minIni;
		int fim = horaFim * 60 + minFim;
		
		int duracao =  0;
		
		if (inicio >= fim) {
			duracao = (24 * 60) - inicio + fim;
		}else {
			duracao = fim - inicio;
		}
		
		int horas = duracao / 60;
		int minutos = duracao % 60;
		
		  System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		  
		  sc.close();
	}

}
