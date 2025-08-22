package arraysproblem;

public class LinearSearch {
	
	
	public static void linearSearch(int arr[],int ele) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("Element found at index:" + ele);
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("Element not exist");
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		linearSearch(arr,13);
		linearSearch(arr,7);
	}

}
