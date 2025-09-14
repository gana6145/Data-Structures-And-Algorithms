package patternprogramming;

import java.util.Scanner;

public class SquareWithDiagonal {
	public static void SquareWithDiagonal(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 || i==num-1 || j==0 || j==num-1 || i==j || i+j==num-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a value to print square:");
		SquareWithDiagonal(scan.nextInt());
	}

}
