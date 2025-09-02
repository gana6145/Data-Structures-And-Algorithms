package stringallproblem;

public class ViceversaCaseConversion {
	
	public static void vicerversaConversion(String name) {
		char ch[]=new char[name.length()];
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(c>='a' && c<='z') {
				ch[i]=(char) (c-32);
			}
			else {
				ch[i]=(char) (c+32);
				
			}
		}
		String  newStr=new String(ch);
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		String name="Ganesh";
		vicerversaConversion(name);

	}

}
