package recursion;

public class NumberDecresing {

	
    public static void numberDecreasing(int num)
    {
    	if (num==0) return;
    	System.out.print(num+ " ");
    	
    	 numberDecreasing(num-1);
    	
    }
	public static void main(String[] args) {
		numberDecreasing(10);

	}

}
