package arraysproblem;

public class SecondMaxArray {
	
	public static int secondMax(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				secMax=max;
				max=arr[i];
			}
			if(arr[i]<max && arr[i]>secMax) {
				secMax=arr[i];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		System.out.println(secondMax(arr));
		
	}

}
