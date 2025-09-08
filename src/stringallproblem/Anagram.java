package stringallproblem;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1, String s2) {
		char ch[] =convertIntoChracter(s1);
		char ch1[] =convertIntoChracter(s2);
		bubbleSort(ch);
		bubbleSort(ch1);
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch1[i]) return false;
		}
		return true;
	}

	
	public static char[] convertIntoChracter(String name) {
		char ch[]=new char[name.length()];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=name.charAt(i);
		}
		return ch;
	}
	
	public static void bubbleSort(char ch[]){
		for(int i=0;i<ch.length;i++) {
			boolean swap=false;
			for(int j=0;j<ch.length-i-1;j++){
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
					swap =true;
				}
				
			}
			if(!swap) {
				return ;
			}
		}
		
	}
	public static void main(String[] args) {
		String s1="cat";
		String s2="act";
		
		System.out.println(isAnagram(s1,s2));

	}

}
