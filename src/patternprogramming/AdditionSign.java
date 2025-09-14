package patternprogramming;

import java.util.Scanner;

public class AdditionSign {
	public static void additionSign(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==num/2 || i==num/2) {
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
		additionSign(scan.nextInt());
	}

}
