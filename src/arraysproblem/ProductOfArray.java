package arraysproblem;

public class ProductOfArray {
	public static void productOfArray(int arr[]){
		int product=1;
		for(int num:arr) {
			product*=num;
		}
		System.out.print("product is:" + product);
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		productOfArray(arr);
		

	}

}
