package arraysproblem;

public class MissingNumber {
	
	
	public static int missingNumber(int arr[]) {
		int sum=0;
		int large=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(large<arr[i]) {
				large=arr[i];
			}
	       }
		int actSum=large*(large+1)/2;
		return actSum-sum;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9};
		System.out.println(missingNumber(arr));
	}
	

}
