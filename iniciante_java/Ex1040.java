import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ("##.0");
		Scanner sc = new Scanner (System.in);
		
		double n1=0,n2=0,n3=0,n4=0;
		
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		n3=sc.nextDouble();
		n4=sc.nextDouble();

		double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
		
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		}else if (media < 5) {
			System.out.println("Aluno reprovado.");
		}else {
			System.out.println("Aluno em exame.");
		
			double notaExame = sc.nextDouble();
			media = (media + notaExame) / 2;
			
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			if (media >=5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f%n", media);
		}
		sc.close();
		
	}

}
