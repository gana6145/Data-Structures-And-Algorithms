package stringallproblem;

public class CompressString {
	
	
	public static String compressString(String str){
		String  ans="";
		int count=1;
		
		for(int i=0,j=i+1;i<str.length();) {
			if((j<str.length())&&(str.charAt(i)==str.charAt(j))) {
				count++;
				j++;
			}
			else {
				if(count>1) {
					ans=ans+str.charAt(i)+count;
				}
				i=j;
				count=1;
				j=i+1;
			}
		}
		
	return ans;
		
	}

	public static void main(String[] args) {
		String str="GGGAANNEESShhh";
		System.out.println(compressString(str));
		

	}

}
