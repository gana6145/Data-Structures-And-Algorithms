package stringallproblem;

public class OccuranceCharacter {
	public static void frequencyArray(String name) {
		char[] ch=new char[name.length()];
		for(int i=0;i<name.length();i++) {
			ch[i]=name.charAt(i);
			}
		
		int ans[] =new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			int count=0;
			if(ans[i]!=-1) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						ans[j]=-1;
						count++;
						}
				}
				
			}
			ans[i]=count;
			}
		
		for(int i=0;i<ans.length;i++) {
			if(ans[i]!=-1) {
				System.out.println( "character " + ch[i] + "reapeted this much of time:" +(ans[i]+1));
			}
		}
		
		
	}

	public static void main(String[] args) {
		String name="Ganeshjadhav";
		frequencyArray(name);
		
	}

}
