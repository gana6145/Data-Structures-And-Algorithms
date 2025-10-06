package arraysproblem;

public class MissingNumber {
	
	
	public static int missingNumber(int arr[]) {
		int n=arr.length-1;
		n=arr[n];
		int sum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			sum-=arr[i];
	       }
		return sum;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		System.out.println(missingNumber(arr));
	}
	

}
