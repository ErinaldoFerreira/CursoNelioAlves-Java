import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int produtos = sc.nextInt();
		int  alcool = 0;
		int gasolina = 0;
		int diesel = 0;
			
		
		
		while (produtos != 4){
			if (produtos ==  1) {
				alcool = alcool + 1;
			}
			else if (produtos == 2) {
				gasolina = gasolina + 1;
			}
			else if (produtos == 3) {
				diesel = diesel + 1;
			}
			
			produtos = sc.nextInt();
			
		
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		sc.close();
	}

}
