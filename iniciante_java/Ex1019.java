package exercicios_beecrowd;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		 int duracaoSeg = sc.nextInt();
		 
		 
		 System.out.print(duracaoSeg / 3600 + " : ");
		 duracaoSeg = duracaoSeg % 3600;
		 
		 System.out.print(duracaoSeg / 60 + " : ");
		 duracaoSeg = duracaoSeg % 60;
		 
		 System.out.println(duracaoSeg);
		 
		 sc.close();
	}

}
