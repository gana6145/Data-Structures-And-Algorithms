package arraysproblem;

import java.util.Arrays;

public class ReverseArray {
	
	public static void BinarySearch(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			arr[start]=arr[start]+arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
			start++;
			end--;
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		BinarySearch(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
