import java.util.Scanner;

public class TwoDArray {
	public static void twoDarray() {
		int rows, columns, i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		columns = sc.nextInt();
		
		int arr[][] = new int[rows][columns]; 
		System.out.println("Enter array elements: ");
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) { 
				System.out.print("["+i+"]["+j+"] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i < rows; i++) {
			System.out.println();
			for (j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		
		twoDarray();

	}
}