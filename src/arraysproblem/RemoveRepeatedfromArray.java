package arraysproblem;

public class RemoveRepeatedfromArray {
	public static int [] uniqueNumber(int arr[] ){
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			ans[i]=count;
		}
		return ans;
	}
	
	public static int[] frequencyArray(int arr[]){
		int ans[]=uniqueNumber( arr);
		int count=0;
		for(int i=0;i<ans.length;i++){
			if(ans[i]==0){
				count++;
				
			}
		}
		int arr1[]=new int[count];
		count=0;
		for(int i=0;i<arr.length;i++){
			if(ans[i]==0){
				arr1[count++]=arr[i];
			}
		}
		return arr1;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,10,20,30,40,50,60,10};
		int [] unique=uniqueNumber(arr);
		for(int num:unique) {
			System.out.print(" " + num);
		}

	}

}
