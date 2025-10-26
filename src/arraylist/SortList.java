package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {

	public static void main(String[] args) {
		
		
		Comparator<Integer> com =new Comparator<Integer>() {
			@Override
			public int compare(Integer i,Integer j) {
				if(i<j) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(15);
		list.add(17);
		
		System.out.println(list);
		Collections.sort(list,com);
		System.out.println(list);

	}

}
