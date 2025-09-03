package stringallproblem;

public class SubStringMethod {
	public static String Substr(String name,int start,int end) {
		String str="";
		
		for(int i=start;i<=end;start++) {
			str=str+name.charAt(start);
		}
		
		return str;
		
		}

	public static void main(String[] args) {
		String name="GAnesh jAdhav";
		System.out.println(Substr(name,1,3));

	}

}
