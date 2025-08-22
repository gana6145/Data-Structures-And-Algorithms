package arraysproblem;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[] = new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
