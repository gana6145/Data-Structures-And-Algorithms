package arraysproblem;

public class KadanesAlgorithm {
	
	public static int maxSubarraySum(int arr[]) {
		int sum=0;
		int max=0;
//		int last=-1;
//		int start=-1;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
//				start=i;
			}
			if(sum>max) {
				max=sum;
//				last=i;
				
				}
		}
//		System.out.println(start+ " "+last);
		return max;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,3,-8,7,-1,2,3};
		System.out.println(maxSubarraySum(arr));
		

	}

}
