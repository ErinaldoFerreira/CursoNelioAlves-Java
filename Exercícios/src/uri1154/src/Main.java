import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		double  media = 0;
		double divisor = 0;
		double soma = 0;
			
		
		
		while (idade > 0){
			
			soma = soma + idade;
			divisor = divisor +1;			
			
			
			idade = sc.nextInt();
		}
		
		media = soma / divisor;
		System.out.printf("%.2f%n", media);
		
		
		
		
		sc.close();
	}

}
