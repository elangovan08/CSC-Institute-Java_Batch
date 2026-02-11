package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int age;
	String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	//toString()  
	public String toString() {
		return "Age :"+age + ", name :" + name ;
	}
	@Override
	public int compareTo(Employee obj) {
		
		return this.name.length()>obj.name.length()?1:-1;
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		
		//Employee em = new Employee(25,"Kavin");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(25,"Kavin"));
		list.add(new Employee(22,"Arun"));
		list.add(new Employee(21,"Harish Ragav"));
		
		System.out.println("Before Sorting :"+list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting :"+list);
	}

}
