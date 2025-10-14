package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDriver2 {
	
	public static int sumArrayList(ArrayList<Integer> list) {
		
		int sum=0;
		for(int num:list) {
			sum+=num;
		}
		return sum;
		
	}
	
public static int[] maxElement(ArrayList<Integer> list) {
		
		int max=list.get(0);
		int min=list.get(0);
		for(int num:list) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		return new int []{max,min};
		
	}

   public static void removeEven(ArrayList<Integer> list) {
	   for(int i=list.size()-1;i>=0;i--) {
		   if(list.get(i)%2==0) {
			   list.remove(i);
		   }
	   }
	   
   }
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		
		System.out.println(sumArrayList(list));
		System.out.println(list);
		removeEven(list);
		System.out.println(list);
		
		Iterator<Integer> i1=list.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}
