package arraysproblem;

public class MergeTwoSortedArray {
	
	public static int[] mergeTwoSortedArray(int arr1[],int arr2[]) {
		int arr3[]=new int [arr1.length+arr2.length];
		int i=0,j=0;
		int start=0;
		
		while(i<arr1.length && j<arr2.length) {
				if(arr1[i]>arr2[j]) {
					arr3[start++]=arr2[j++];
				}
				else {
					arr3[start++]=arr1[i++];
				}
			}
			
			while(i<arr1.length) {
				arr3[start++]=arr1[i++];
			}
			while(j<arr2.length) {
				arr3[start++]=arr2[j++];
			}
			
		
		return arr3;
		
	}

	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50,50};
		int arr2[]= {11,12,13,14,15,16,17,18,19,20,51,54};
		
		
		for(int num:mergeTwoSortedArray(arr1,arr2)) {
			System.out.print(num+ " ");
		}
		

	}

}
