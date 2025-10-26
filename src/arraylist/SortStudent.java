package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudent {

	public static void main(String[] args) {
		
		Comparator<Student> sortByAge=new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				if(s1.age<s2.age) {
					return -1;
					
				}
				return 1;
			}
		};
		Comparator<Student> sortByname=new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				return s1.name.compareToIgnoreCase(s2.name);
			}
		};
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("Zoya",29));
		list.add(new Student("ganesh",32));
		list.add(new Student("Omkar",23));
		list.add(new Student("Mohan",25));
		list.add(new Student("Rupesh",29));
		Collections.sort(list,sortByname);
		System.out.println(list);
		
	}

}

class Student{
	String name;
	int age;
	
	public Student(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
		
		public String toString(){
			
			 return "[Name:"+name+ "Age:" +age + "]";
		}
		
		
	
	
}