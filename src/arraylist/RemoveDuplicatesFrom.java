package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFrom {

	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
        l1.add(100);
		l1.add(110);
		l1.add(10);
		l1.add(10);
		l1.add(10);
		l1.add(10);
		l1.add(120);
		l1.add(130);
		l1.add(140);
		l1.add(140);
		l1.add(140);
		l1.add(190);
		System.out.println(l1);
		
		LinkedHashSet<Integer>s1=new LinkedHashSet<Integer>(l1);
		System.out.println(s1);
	}

}
