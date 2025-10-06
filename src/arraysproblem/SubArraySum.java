package arraysproblem;

public class SubArraySum {
	
	
	public static void subarraySum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				System.out.print(sum + ",");
			}
			System.out.println();
			
			}
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		subarraySum(arr);

	}

}
