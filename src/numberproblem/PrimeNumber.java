package numberproblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
	public static String checkPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return "number is not a prime number";
			}
		}
		
			return "number is prime  number";
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check prime:");
		try {
			System.out.println(checkPrime(scan.nextInt()));
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid integer number");
		}
		finally {
			System.out.println("Thank u program executed Successfully");
		}

	}

}
