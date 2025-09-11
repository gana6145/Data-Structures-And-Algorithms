package stringallproblem;

public class RotatingPallindrome {
	
//	public static boolean rotateCheck(String str) {
//		
//		
//	}
	
	public static boolean isPallindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String name="add";

	}

}
