package stringallproblem;

public class ExtractChracterFromString {
	
	
	public static void extractCharacter(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
	}
	public static void extractCharacterInReverse(String name) {
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		String name="Ganesh";
//		extractCharacter(name);
		extractCharacterInReverse(name);
		
	}

}
