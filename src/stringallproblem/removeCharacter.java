package stringallproblem;

public class removeCharacter {
	
public static String removeCharacter(String name,char c) {
	int count=0;
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==c) {
			count++;
		}
	}
	char ch[]=new char[name.length()-count];
	count=0;
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)!=c) {
			ch[count++]=name.charAt(i);
		}
	}
	return new String(ch);
}

	public static void main(String[] args) {
		String name="Ganesh";
		System.out.println(removeCharacter("Ganesh",'a'));

	}

}
