package stringallproblem;

public class LengthMethodOfString {

	
	public static int lengthString(String name) {
	int count=0;
	
		for(int i=0;;i++) {
			try {

				char ch=name.charAt(i);
				count++;
			
               }
			catch(StringIndexOutOfBoundsException e) {
				return count;				
		}
	}
		
	}  
	public static void main(String[] args) {
		String name="GaneshJadhav";
//		System.out.println(name.length());
		System.out.println(lengthString(name));

	}

}
