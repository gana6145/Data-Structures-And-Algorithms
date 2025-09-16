package stringallproblem;

import java.util.Arrays;

public class Panagram {
	
	
	public static boolean isPanagram(String s) {
		s=s.toLowerCase();
		int arr[]=new int[26];
		System.out.println(Arrays.toString(arr));
		
	for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				arr[s.charAt(i)-97]++;
				}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				return false; 
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "he quick brown fox jumps over he lazy dog";
        System.out.println(isPanagram(str));

	}

}
