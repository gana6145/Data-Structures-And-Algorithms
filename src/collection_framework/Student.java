package collection_framework;

public class Student {
	private static int count=1;
	String name;
	int roll_no;
	
	String collegeName;
	{
		collegeName="Cusrow Wadia Institute Of technology";
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		this.name=name;
		this.roll_no=count++;
	}
	
	
	@Override
	public String toString() {
		return "[Name:" +name+ " CollegeName:"+collegeName+ " Roll_no:"+roll_no+"]";
	}
	
	
}
