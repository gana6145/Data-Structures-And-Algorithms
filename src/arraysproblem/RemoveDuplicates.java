package arraysproblem;

public class RemoveDuplicates {
	public static int[] duplicateMarkArray(int arr[]) {
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(ans[i]!=-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						ans[j]=-1;
					}
				}
				ans[i]=count;
			}
		}
		return ans;
	}
	
	public static int[] uniqueArray(int arr[]) {
		int []darr=duplicateMarkArray(arr);
		int count = 0;
		for(int i=0;i<darr.length;i++) {
			if(darr[i]!=-1) {
				count++;
			}
		}
		
		
		int uniqueArray[]=new int [count];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(darr[i]!=-1) {
				uniqueArray[count++]=arr[i];
			}
		}
		return uniqueArray;
	}
	
	public static void printArray(int arr[]) {
		for(int num:arr) {
			System.out.println("Number:"+ num);
		}
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,1,2,3,4,5,4,4,777,77,7,1,1,1};
		
		printArray(uniqueArray(arr));
		
		

	}

}
