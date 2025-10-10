package arraylist;

import java.util.Scanner;

public class Student {
	
	static int count=0 ;
	static {
		count=new Scanner(System.in).nextInt();
		System.out.println("count intialized with:" +count);
	}
	
	String name;
	int age;
	int roll_no;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		this.roll_no=count++;
	}
	@Override
	public String toString() {
		return "[name:" + name + " Age:" +age + " RollNo:" + roll_no+ " ]";
	}
	
	public int hashcode() {
		return name.hashCode()+age+roll_no;
	}
	

}
