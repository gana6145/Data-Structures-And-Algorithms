package arraysproblem;

public class KadansModfication {
	public static int maxSum(int arr[]){
		int sum=0;
		int max=0;
		int large=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
			}
			if(sum>max) {
				max=sum;
			}
			if(large<arr[i]) {
				large=arr[i];
			}
		}
		if(max==0) {
			if(max==large) {
				return large;
		}
			return large;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,-30,30,40};
		System.out.println(maxSum(arr));
		

	}

}
