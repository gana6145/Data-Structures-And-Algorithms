package stringallproblem;

import java.util.Arrays;

public class Permutation {
	
	
	public static void permitution(char ch[],int fix) {
		
	if(fix==ch.length-1 ) {
		System.out.println(Arrays.toString(ch));
		
		return;
	}
	for(int i=fix;i<ch.length;i++) {
		swap(ch,fix,fix+1);
		permitution(ch,fix+1);
		swap(ch,i,fix);
	}
	
	}
	public static void swap(char[]ch,int i,int j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}

	public static void main(String[] args) {
		char ch[]= {'a','b','c','d'};
		permitution(ch,0);

	}

}
