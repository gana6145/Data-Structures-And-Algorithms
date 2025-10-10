package arraylist;
import java.util.*;
public class ArrayListDriver {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Ganesh",22));
		list.add(new Student("Ajinkya",23));
		list.add(new Student("Shrikant",24));
		list.add(new Student("Atharva",21));
		list.add(new Student("Pavan",20));
		list.add(new Student("Pratik",25));
		
		System.out.println(list);
		
		

	}

}
