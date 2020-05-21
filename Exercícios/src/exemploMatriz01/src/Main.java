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
		int matriz2 [][] = new int [linha][coluna];
		int matriz3 [][] = new int [linha][coluna];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.println("Informe o valor para " + i + " - " + j + ":");
				matriz[i][j] = leitor.nextInt();
				System.out.println("Informe o valor para " + i + " - " + j + ":");
				matriz2[i][j] = leitor.nextInt();
				
			}
		}
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz3[i][j] = matriz[i][j] + matriz2[i][j];
				
			}
		}
		
		
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz3[i][j]);
				
			}
			
			System.out.print("\n");
		}
	

	}

}
