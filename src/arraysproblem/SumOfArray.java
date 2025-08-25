package arraysproblem;

public class SumOfArray {
	public static void sumOfArrayElement(int arr[]) {
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("sum is:" + sum);
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		sumOfArrayElement(arr);
		

	}

}
