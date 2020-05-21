import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, num1, cod2, num2;
		double valUni1, valUni2, valTot;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valUni1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valUni2 = sc.nextDouble();
		
		valTot = (num1*valUni1) + (num2*valUni2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valTot);
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
