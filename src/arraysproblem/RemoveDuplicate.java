package arraysproblem;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(frequency(arr)));
		System.out.println(Arrays.toString(remove(arr,frequency(arr))));

	}
	
	public static int [] frequency(int arr[]) {
		int freq[]=new int[arr.length];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
		 count=0;
		if(freq[i]!=-1) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						freq[j]=-1;
					}
					
				}
			}
		freq[i]=count;
			
		}
		return freq;
	}
	
	public static int [] remove(int [] arr,int newArr[]) {
		int count=0;
		
		for (int i = 0; i < newArr.length; i++) {
			if(arr[i]!=-1) {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
			
			int [] uniqueArray=new int[count];
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(newArr[j]!=-1) {
					uniqueArray[count++]=arr[j];
				}
			}
			
		
		return uniqueArray;
		
	}

}
