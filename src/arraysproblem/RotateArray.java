package arraysproblem;

public class RotateArray {
	
	
	public static void rotateArray(int arr[]) {
		int num=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			}
		arr[0]=num;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		rotateArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

}
}