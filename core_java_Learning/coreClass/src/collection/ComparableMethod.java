package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collection - interface 

		//Collections - class

class Students implements Comparable<Students>{
	
	int age;
	String name;
	int totalMark;
	public Students(int age, String name, int totalMark) {
		super();
		this.age = age;
		this.name = name;
		this.totalMark = totalMark;
	}
	@Override
	public String toString() {
		return "Students [age=" + age + ", "
				+"name=" + name + ","
				+ "totalMark=" + totalMark + "]";
	}
	@Override
	public int compareTo(Students s) {
		
		return this.age>s.age?1:-1;  //ternary operator 
		
	}
	
}   //


public class ComparableMethod {

	public static void main(String[] args) {
		
		Students std1 = new Students(21,"Karthi",450);
		Students std2 = new Students(23,"Harish ragav",420);
		Students std3 = new Students(19,"Sathish",430);
		
		List<Students> list = new ArrayList<Students>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		//abstract method Comparator.compare(Object, Object)
 
		
		Collections.sort(list); //compareTo() --> Comparable
		
		list.forEach(System.out::println);

		
	}  //toString(){[collection.Students +hashCode()  }

}
