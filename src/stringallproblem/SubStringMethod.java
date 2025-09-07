package stringallproblem;

public class SubStringMethod {
	public static String subStr(String name,int start,int end) {
		String str="";
		
		for(int i=start;i<=end;i++) {
			str=str+name.charAt(i);
		}
		
		return str;
		
		}

	public static void main(String[] args) {
		String name="GAnesh jAdhav";
		System.out.println(subStr(name,1,3));

	}

}
