package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student("Ganesh"));
		list.add(new Student("Ajinkya"));
		list.add(new Student("Raju"));
		list.add(new Student("Pratik"));
		list.add(new Student("Shubham"));
		list.add(new Student("Nagesh"));
		
		list.stream().forEach(s1->System.out.println(s1));
		System.out.println("==========================");
		Collections.sort(list,(s1,s2)->s1.name.compareTo(s2.name));
		list.stream().forEach(s1->System.out.println(s1));

		

	}

}
