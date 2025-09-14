package patternprogramming;

import java.util.Scanner;

public class SquarePattern {
	
	
	public static void squarePattern(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a value to print square:");
		squarePattern(scan.nextInt());
	}

}
