package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		
		Comparator<String> com=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()<o2.length()) {
					return -1;
				}
				return 1;
				
			}
			
		};
		List<String> name=new ArrayList<>();
		name.add("Ganesh");
		name.add("mohan");
		name.add("raju");
		name.add("shivam");
		name.add("kirti");
		name.sort(null);
		
		name.sort(com);
    	System.out.println(name);
		
		

	}

}
