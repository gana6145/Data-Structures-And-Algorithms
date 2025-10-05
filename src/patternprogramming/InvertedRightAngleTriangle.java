package patternprogramming;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
	public static void invertedRightAngledTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
				}
			for(int j=0;j<num-i;j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		invertedRightAngledTriangle(scan.nextInt());
		
	}

}
