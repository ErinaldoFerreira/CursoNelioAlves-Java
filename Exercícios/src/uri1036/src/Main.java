import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = B * B - 4.0 * A * C;
		
		if(A == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
			double x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			double x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("x1 = %.5f%n", x1);
			System.out.printf("x2 = %.5f%n", x2);
		}
				
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		

	}

}
