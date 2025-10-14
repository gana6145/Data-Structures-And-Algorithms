package arraylist;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int empNo;
	private String job;
	
	
	public Employee(String name,int empNo,String job) 
	{
		this.name=name;
		this.empNo=empNo;
		this.job=job;
     }	
	
	
	public String toString() {
		
		return "[ Name:" + name+ " Empno: "+empNo+" Job: "+job+" ]";
		
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empNo-o.empNo;
	}

}

