package arraysproblem;

public class BubbleSort {
	
	
	public static void bubbleSort(int arr[]) {
		boolean swap=false;
		for(int i=0;i<arr.length;i++) {
			swap=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swap=true;
				}
		    }
			if(!swap) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]={11,12,15,14,13,9,8,16};
		bubbleSort(arr);
		for(int num:arr) {
			System.out.print(num + " ");
		}
		

	}

}
