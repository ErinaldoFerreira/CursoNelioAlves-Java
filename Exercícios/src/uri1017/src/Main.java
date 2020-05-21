import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t, v;
		double l, d, k=12;
		
		t = sc.nextInt();
		v = sc.nextInt();
		
		d = t*v;
		l = d / k;
		
		System.out.printf("%.3f%n", l);
		
		sc.close();
			
		
		
		
		
		
		

	}

}
