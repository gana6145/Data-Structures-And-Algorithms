package stringallproblem;

public class ResverseString {
	
	public static String reverseString(String name) {
		String op="";
		for(int i=name.length()-1;i>=0;i--) {
			op+=name.charAt(i);
		}
		return op;
	}
	

	public static void main(String[] args) {
		String name="Ganesh";
		System.out.println(reverseString(name));
		
	}

}
