package stringallproblem;

public class AlternateUpperCase {
	
	
	public static String alternateCapital(String name) {
		name=name.toLowerCase();
		String str="";
		for(int i=0;i<name.length();i++) {
			if(i%2==0) {
				str=str+(char)(name.charAt(i)-32);
			}
			else {
				str=str+name.charAt(i);
			}
		}
		return str;
	}


	public static void main(String [] args) {
		System.out.println(alternateCapital("ganesh"));
		
	}
	

	

}
