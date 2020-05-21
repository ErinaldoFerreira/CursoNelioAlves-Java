import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, cem, cinq, vin, dez, cin, dois, um, resto;
		
		
		N = sc.nextInt();
		
		cem = N / 100;		
		resto = N % 100;
		
		cinq = resto / 50;
		resto = cinq % 50;
				
		vin = resto / 20;
		resto = vin % 20;
		
		dez = resto / 10;
		resto = dez % 10;
		
		cin = resto / 5;
		resto = cin % 5;
		
		dois = resto / 2;
		resto = dois % 2;
		
		um = resto % 1;
		
		
		
		
		System.out.println(cem + " notas (s) de R$ 100,00");
		System.out.println(cinq + " notas (s) de R$ 50,00");
		System.out.println(vin + " notas (s) de R$ 20,00");
		System.out.println(dez + " notas (s) de R$ 10,00");
		System.out.println(cin + " notas (s) de R$ 5,00");
		System.out.println(dois + " notas (s) de R$ 2,00");
		System.out.println(um + " notas (s) de R$ 1,00");
		
		
		
		
		
		sc.close();
		
		
		
		
		

	}

}
