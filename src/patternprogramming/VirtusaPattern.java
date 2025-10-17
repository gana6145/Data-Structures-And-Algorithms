package patternprogramming;

import java.util.Scanner;

public class VirtusaPattern {
	public static void pattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("  "); 			
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			for(int l=2;l<=i;l++) {
				System.out.print(l+" ");
			}
		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(new Scanner(System.in).nextInt());

	}

}
