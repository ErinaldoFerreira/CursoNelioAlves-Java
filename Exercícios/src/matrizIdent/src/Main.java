import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int linha, coluna;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o numero de linhas:");
		linha = leitor.nextInt();
		
		System.out.println("Informe o numero de colunas:");
		coluna = leitor.nextInt();
		
		int matriz [][] = new int [linha][coluna];
		
		
		for ( int i = 0; i < linha; i++) {
			for ( int j = 0; j < coluna; j++) {
				System.out.println("Informe o valor para " + i + " - " + j + ":");
				matriz[i][j] = leitor.nextInt();
				
				
			}
			
		}
		
		for ( int i = 0; i < linha; i++) {
			for ( int j = 0; j < coluna; j++) {
				
				if (i == j ) {
					if (matriz[i][j] == 1) {
						System.out.println("matriz identidade");
					}	
				}
				
			}
			
		}

		
		
		
		
		
	

	}

}
