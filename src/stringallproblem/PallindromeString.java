package stringallproblem;

public class PallindromeString {
	
	
	public static boolean isPallindrome(String name) {
		
		int start=0;
		int end=name.length()-1;
		while(start<end) {
			if(name.charAt(start)!=name.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		String name="GANAG";
		System.out.println(isPallindrome(name));
		
	}

}
