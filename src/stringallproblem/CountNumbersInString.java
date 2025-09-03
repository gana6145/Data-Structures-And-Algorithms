package stringallproblem;

public class CountNumbersInString {
	
	
	public static int countNumber(String name) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>=48 && name.charAt(i)<=57) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String name="G1anesh17jadhav";
		System.out.println(countNumber(name));

	}

}
