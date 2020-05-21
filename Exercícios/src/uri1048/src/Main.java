import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double sal = sc.nextDouble();
		double salRe, rea, per;
		
		
		
		if(sal <= 400.00) {
			per = 15.00;
			
		}
		else if (sal <= 800.00){
			per = 12.0;
			
		}
		else if (sal <= 1200.00){
			per = 10.0;
			
		}
		else if (sal <= 2000.00){
			per = 7.0;
			
		}
		else {
			per = 4.0;
			
		}
		
		rea = sal * per / 100;
		salRe = sal + rea;
		
		System.out.printf("Novo salario: %.2f%n", salRe);
		System.out.printf("Reajuste ganho: %.2f%n", rea);
		System.out.printf("Em percentual: %.0f %%%n", per);
				
		
		
		
		sc.close();
		
		
		
		
		

	}

}
