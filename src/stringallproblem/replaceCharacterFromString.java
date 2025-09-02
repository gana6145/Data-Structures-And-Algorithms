package stringallproblem;

public class replaceCharacterFromString {
	
	public static String replaceCharacter(String name ,char c,char nCh) {
		char ch[] =new char[name.length()];
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==c) {
				ch[i]=nCh;
			}
			else {
				ch[i]=name.charAt(i);
			}
		}
		return new String(ch);
	}

	
	public static void main(String[] args) {
		String name="Banana";
		System.out.println(replaceCharacter(name,'a','t'));
	}

}
