package arraysproblem;

public class MoveZero {
     
	
	
	
	
	public static void moveZero(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			if(start==0 && end!=0) {
				arr[start]=arr[end];
				arr[end]=0;
			}
			if(start!=0) {
				start++;
			}
			if(end==0) {
				end--;
			}
		}
	}

	public static void main(String[] args) {
		int num[]= {10,0,20,0,40};
		System.out.println("executin Started");
		moveZero(num);
		System.out.println("executin ended");
		System.out.println(num);

	}

}
