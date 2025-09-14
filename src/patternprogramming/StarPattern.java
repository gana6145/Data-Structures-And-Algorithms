package patternprogramming;

import java.util.Scanner;

public class StarPattern {
	public static void starPattern(int num) {
		int half=num/2;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==half || j==half) {
					
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a value to print square:");
		starPattern(scan.nextInt());
	}

}
