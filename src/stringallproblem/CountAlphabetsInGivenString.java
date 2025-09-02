package stringallproblem;

public class CountAlphabetsInGivenString {
	
	
	public static void countAlphabets(String name) {
		int chCount=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				chCount++;
			}
		}
		System.out.print(chCount);
		
	}

	public static void main(String[] args) {
		String name="Ganesh123Ganesh";
		countAlphabets(name);
		
		
	}

}
