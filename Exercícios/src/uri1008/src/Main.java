import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f, h;
		double vh, s;		
		
		f = sc.nextInt();
		h = sc.nextInt();
		vh = sc.nextDouble();
		
		s = h*vh;
		
		System.out.println("NUMBER = " + f);
		System.out.printf("SALARY = U$ %.2f%n", s);
		
		sc.close();

	}

}
