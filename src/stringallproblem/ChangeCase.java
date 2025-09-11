package stringallproblem;

public class ChangeCase {
	public static  String toLowerCase(String s) {
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ch[i]=(char)(s.charAt(i)+32);
            }
            else{
            ch[i]=s.charAt(i);
            }
        }
        return new String(ch);
        
    }

	public static void main(String[] args) {
		String name="GanesH@";
		System.out.println(toLowerCase(name));
		

	}

}
