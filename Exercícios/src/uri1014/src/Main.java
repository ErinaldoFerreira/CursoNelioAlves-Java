import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int disTot;
		double totCom, comLit;
		
		disTot = sc.nextInt();
		totCom = sc.nextDouble();
		
		comLit = disTot / totCom;
		
		System.out.printf("%.3f km/l%n", comLit);
		
		sc.close();

	}

}
