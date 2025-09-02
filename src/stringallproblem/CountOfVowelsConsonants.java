package stringallproblem;

public class CountOfVowelsConsonants {
	public static void countVowelsConsonanats(String name) {
		int count=0;
		int cons=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U') {
				count++;
			}
			else {
				cons++;
			}
		}
		System.out.println("Vowel count is " + count);
		System.out.println("Consonant count is" + cons);
		
	}

	public static void main(String[] args) {
		String name="Ganesh";
		countVowelsConsonanats(name);
		
		

	}

}
