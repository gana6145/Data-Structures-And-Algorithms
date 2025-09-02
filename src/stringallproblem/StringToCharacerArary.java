package stringallproblem;

import java.util.Arrays;

public class StringToCharacerArary {
	
	public static void charArray(String name) {
	char ch[]=new char[name.length()];
	for(int i=0;i<name.length();i++) {
		ch[i]=name.charAt(i);
	}
	System.out.print(Arrays.toString(ch));
	
	}

	public static void main(String[] args) {
		String name="Ganesh";
		charArray(name);

	}

}
