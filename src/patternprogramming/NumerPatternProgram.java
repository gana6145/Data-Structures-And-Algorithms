package patternprogramming;

public class NumerPatternProgram {
	
	public static void numberPattern(int num) {
		int start=1;
		int end;
		for(int i=1;i<=num;i++) {
			end=start+i-1;
			for(int j=end;j>=start;j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			start=end+1;
		}
	}
	public static void main(String[] args) {
		numberPattern(5);
		
	}

}
