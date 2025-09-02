package stringallproblem;

public class removeDuplicate {
	
	
	public static String removeDuplicate(String name) {
		int freq[]=frequencyArray(name);
		int count=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=-1) {
				count++;
			}
		}
		char ch[]=new char[count];
		count=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=-1) {
				ch[count++]=name.charAt(i);
			}
		}
		
		for(int i=0;i<count ;i++) {
			boolean swap=false;
			for(int j=i+1;j<count;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					swap=true;
				}
			}
			if(!swap) {
				return new String(ch);
			}
		}
		return new String(ch);
	}
	
	public static int[] frequencyArray(String name) {
		
		int frequency[]=new int[name.length()];
		int count=0;
		for(int i=0;i<name.length();i++) {
			count=0;
			if(frequency[i]!=-1) {
				for(int j=i+1;j<name.length();j++) {
					if(name.charAt(i)==name.charAt(j)) {
					 count++;
					 frequency[j]=-1;
					}
					
				}
				frequency[i]=count;
			}
		}
		return frequency;
	}

	public static void main(String[] args) {
		String name="hGanesh";
		System.out.println(removeDuplicate(name));

	}

}
