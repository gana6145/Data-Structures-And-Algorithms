package stringallproblem;

import java.util.Arrays;

public class AnagramWithoutSortingOptimize {
	public static boolean isAnagram(String s1, String s2) {
        if(s1.length()==s2.length()){
            int ch1[]=new int[26];
            int ch2[]=new int[26];
            for(int i=0;i<s1.length();i++){
                ch1[s1.charAt(i)-97]++;
                ch2[s2.charAt(i)-97]++;

            }
            System.out.println(Arrays.toString(ch1));
            System.out.println(Arrays.toString(ch2));
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }

	public static void main(String[] args) {
		String s1="listenn";
		String s2="silentt";
		System.out.println(isAnagram(s1,s2));	
	}

}
