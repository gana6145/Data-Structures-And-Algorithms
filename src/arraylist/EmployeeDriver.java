package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

	public static void main(String[] args) {
	 ArrayList<Employee> a1=new ArrayList<>();
	 a1.add(new Employee("ganesh",3,"Manager"));
	 a1.add(new Employee("Harshal",2,"salesman"));
	 a1.add(new Employee("Raju",1,"Operation"));
	 a1.add(new Employee("Rohit",6,"Analyst"));
	 a1.add(new Employee("Vrushab",5,"Developer"));
	 System.out.println(a1);
	 Collections.sort(a1);
	 System.out.println(a1);

	}

}
