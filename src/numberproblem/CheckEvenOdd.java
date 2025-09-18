package numberproblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckEvenOdd {
	
	public static String  checkEvenOdd(int num) {
		return (num%2==0) ? "number is even" :"number is odd";
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a  number to check even odd:");
		try {
			System.out.println(checkEvenOdd(scan.nextInt()));
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid integer number");
		}
		finally {
			System.out.println("Thank u program executed Successfully");
		}
	}

}
