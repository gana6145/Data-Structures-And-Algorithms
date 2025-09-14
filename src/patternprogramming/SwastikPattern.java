package patternprogramming;

import java.util.Scanner;

public class SwastikPattern {
	public static void printSwastik(int num)
	{
		int half=num/2;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==half || j==half || (i==0 && j>half) || (j==num-1 && i>half) ||(j==0 && j>half) ||(i==num-1 && j<half)||(j==0 && i<half)) {
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
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to print swastik");
		printSwastik(scan.nextInt());
		

	}

}
