package arraysproblem;

public class MaximumReapeatingNumber{
	public static void maximumReapeatingsequence(int arr[]) {
		int count=0;
		int index = 0;
		int maxCount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				
			}
			else if(count>maxCount) {
				maxCount=count;
				count=0;
				index=i;
			}
			else
			count=0;
			
		}
	System.out.println("MaxrepeatedSubsequence is :"+ arr[index] + " " +maxCount);
	}
             
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,2,2,3,3,4,5,5,5,5,5,5,3,3,4};
		maximumReapeatingsequence(arr);
		

	}

}
