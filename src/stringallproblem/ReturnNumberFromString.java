package stringallproblem;

public class ReturnNumberFromString {
	
	
	public static int returnNumber(String str) {
		int number=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				number=number*10+(str.charAt(i)-48);
			}
		}
		return number;
		
	}

	public static void main(String[] args) {
		String str="Gane1sh123";
		System.out.println(returnNumber(str));
	}

}
