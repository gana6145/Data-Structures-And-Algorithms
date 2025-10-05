package patternprogramming;

import java.util.Scanner;

public class InvertedTriangle {
	public static void invertedTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			invertedTriangle(scan.nextInt());
		}

}
