package arraysproblem;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(addElement(1,2,arr)));
		

	}
	public static int [] addElement(int index,int ele,int arr[]) {
		int newArr[]=new int[arr.length+1];
		newArr[index]=ele;
		for(int i=0;i<newArr.length;i++) {
			if(i==index) continue;
			if(i<index) {
				newArr[i]=arr[i];
			}
			if(i>index) {
				newArr[i]=arr[i-1];
			}
		}
		return newArr;
	}

}
