import java.util.Scanner;

public class MatrizSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int matriz1 [][] = new int [x] [y];
		
		
		for (int i = 0; i<x; i++) {
			for (int j = 0; j<y; j++) {
				matriz1[i][j]= sc.nextInt();
			}
		}
		
		for (int i = 0; i<x; i++) {
			for (int j = 0; j<y; j++) {
				System.out.print(matriz1[j][i]);
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
