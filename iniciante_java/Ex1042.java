import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] array = new int [3];
		int [] arraySort = new int [3];
		
		for (int i=0; i<3; i++) {
			array [i] = sc.nextInt();
			arraySort [i] = array[i];
			
		}
		
		Arrays.sort(arraySort);
		
		for (int i=0; i<3; i++) {
			System.out.println(arraySort[i]);
		}
		System.out.println();
		
		for (int i=0; i<3; i++) {
			System.out.println(array[i]);
		}
		
	sc.close();

	}

}
