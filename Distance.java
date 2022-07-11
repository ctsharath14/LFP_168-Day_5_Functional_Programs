//program that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of X:");
		x = sc.nextInt();
		
		System.out.print("Enter value of Y:");
		y = sc.nextInt();
        
        double dist = Math.sqrt(x*x + y*y);
        
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	sc.close();
	}
	
}