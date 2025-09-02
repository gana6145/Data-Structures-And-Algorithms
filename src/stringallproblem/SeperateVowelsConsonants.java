package stringallproblem;

public class SeperateVowelsConsonants {
	public static void segreagetString(String name) {
		String vowel="";
		String cons="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U') {
				vowel+=ch;
			}
			else {
				cons+=ch;
			}
		}
		System.out.println(vowel);
		System.out.println(cons);
		
	}

	public static void main(String[] args) {
		String name="Ganesh";
		segreagetString(name);
		
		
	}

}
