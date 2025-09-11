package arraysproblem;

public class KadanesAlgorithm {
	
	public static int maxSubarraySum(int arr[]) {
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
			}
			if(sum>max) {
				max=sum;
			
			}
		}

		return max;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,3,-8,-7,-1,2,3,-7,-77};
		System.out.println(maxSubarraySum(arr));
	}

}
