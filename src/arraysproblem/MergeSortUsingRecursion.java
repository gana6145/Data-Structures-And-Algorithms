package arraysproblem;

import java.util.Arrays;

public class MergeSortUsingRecursion {
	
	
	public static void merge(int[]a,int start,int mid,int end) {
	int i=start;
	int j=mid+1;
	int k=0;
	
	int ans[] = new int[end - start + 1];
	 while (i <= mid && j <= end) {
         if (a[i] <= a[j]) {
             ans[k++] = a[i++];
         } else {
             ans[k++] = a[j++];
         }
     }
	 while (j <= end) {
         ans[k++] = a[j++];
     }
	 while (i <= mid) {
		    ans[k++] = a[i++];
		}


	 for (int z = 0; z < ans.length; z++) {
         a[start + z] = ans[z];
     }

		
	}
	
	public static void mergeSort(int arr[],int start,int end) {
		if(start>=end) {
			
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
      int[]a= {-8,3,6,4,-2,1,9,5,30,0,1};
		
		mergeSort(a, 0, a.length-1);
		

	}

}
