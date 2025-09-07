package stringallproblem;

public class reverseWordsFromSentence {
	
	public static String reverseWordsFromSentence(String str) {
		str=str+" ";
		String  ans="";
		String word="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				ans=ans+reverseWord(word) +" ";
				word="";
			}
			else {
				word=word+str.charAt(i);
			}
		}
		return ans;
		
	}
	
	public static String reverseWord(String word) {
		char ch[]=new char[word.length()];
		for(int i=0;i<word.length();i++) {
			ch[i]=word.charAt(i);
		}
		int start=0;
		int end=word.length()-1;
		
		while(start<end) {
			char temp=ch[start];
			ch[start++]=ch[end];
			ch[end--]=temp;
			}
		return new String(ch);
		
	}

	public static void main(String[] args) {
		String str="My name is Ganesh";
		System.out.println(reverseWordsFromSentence(str));
		

	}

}
