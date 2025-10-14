package numberproblem;

public class fibonacciNumber {
	
	
	public static void fibonacciSeries(int num) {
		int n1=0;
		int n2=1;
		int n3;
		while(n1<num) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
		}
	}

	public static void main(String[] args) {
		
		fibonacciSeries(50);
	}

}
