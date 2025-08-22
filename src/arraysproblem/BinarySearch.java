package arraysproblem;

public class BinarySearch {
	
	public static int BinarySearch(int arr[], int  num) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=(start+end)/2;
			if(arr[mid]==num) {
				return mid;
				
			}
			if(arr[mid] >num) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(BinarySearch(arr,11));
		

	}

}
