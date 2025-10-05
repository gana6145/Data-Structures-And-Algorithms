package patternprogramming;

import java.util.Scanner;

public class RightAngleTriangle {
	
	public static void rightAngle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		rightAngle(scan.nextInt());

	}

}
