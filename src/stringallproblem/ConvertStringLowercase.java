package stringallproblem;

public class ConvertStringLowercase {
	public static void stringLowecase(String name) {
		char cha[]=new char[name.length()];
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			if(ch>='A' && ch<='Z') {
			cha[i]= (char) (ch+32);
			}
			else {
				cha[i]=ch;
			}
		}
		String newStr=new String(cha);
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		String name="GAnESH";
		stringLowecase(name);

	}

}
