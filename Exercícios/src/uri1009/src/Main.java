import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double quant, salario, total;
		String nome;
		
		nome = sc.next();
		salario = sc.nextDouble();
		quant = sc.nextDouble();
		
		total = salario + quant * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);	
		
		
		
		sc.close();
		
	}

}
