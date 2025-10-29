package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "ganesh");
		hm.put(2, "Pratik");
		hm.put(3, "Om");
		hm.put(4, "Harshal");
		hm.put(5, "Nagesh");
		hm.put(6, "Shubash");
		hm.put(7, "Rocky");
		Set<Integer> s1= hm.keySet();
		Iterator<Integer> it=s1.iterator();
		
		while(it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}
		

	}

}