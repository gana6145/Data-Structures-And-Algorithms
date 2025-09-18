package numberproblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {
	public static int reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to be reversed:");
		try {
			System.out.println(reverseNumber(scan.nextInt()));
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid integer number");
		}
		finally {
			System.out.println("Thank u program executed Successfully");
		}

	}

}
