package stringallproblem;

public class SegeregateUpperCaseAndLowerCase {
	public static void segregateLowerUpper(String s) {
		String upper="";
		String lower="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				upper+=s.charAt(i);
			}
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				lower+=s.charAt(i);
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}

	public static void main(String[] args) {
		String  name="GaneshGaB";
		segregateLowerUpper(name);
		 

	}

}
