package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Ganesh");
		hm.put(2, "Pavan");
		hm.put(3, "Pavan");
		
//		System.out.println(hm);
//        System.out.println(hm.containsValue("Ganesh"));
//        Set<Integer> set=hm.keySet();
//        
//        for(Integer name: hm.keySet()) {
//        	System.out.println(hm.get(name));
//        	
//        }
      Set<Map.Entry<Integer,String>> entry=  hm.entrySet();
      
      for(Entry<Integer, String> entr:entry) {
    	  System.out.println(entr.setValue(entr.getValue().toUpperCase()));
      }
      System.out.println(hm);
      hm.remove(1);
      System.out.println(hm);
	}

}
