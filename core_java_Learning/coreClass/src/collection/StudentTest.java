package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	String name;
	int age;
	int rollNo;
	public StudentTest(String name, int age, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {
		
		StudentTest std1 = new StudentTest("John",55,103);
		StudentTest std2 = new StudentTest("Robert",27,102);
		StudentTest std3 = new StudentTest("Arun",13,101);

		List<StudentTest> list = new ArrayList<StudentTest>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
//		for(Object ls:list) {
//			
//		System.out.println(ls);
//		
//		}
		System.out.println("Sorting by Age :");
		list.sort(Comparator.comparingInt(f->f.age));
		list.forEach(System.out::println); //Method reference or Double colon 
		
		System.out.println("Sorting by rollNo : ");
		list.sort(Comparator.comparingInt(f->f.rollNo));
		list.forEach(System.out::println);
		
		System.out.println("Sorting by Name : ");
		list.sort(Comparator.comparing(f->f.name));
		list.forEach(System.out::println);
	}
	
	//hashCode(){  toString() }	
//hashCode
//	public int hashCode() {
//		return 1;
//		
//	}
	@Override
	public String toString() {
		return "StudentTest [name=" + name + ", "
				+ "age=" + age + ", "
						+ "rollNo=" + rollNo + "]";
	}
	
	
	//Collection API 
	
	//List ,Set ,Map
	//Its Implemented classes
	
	
	//Comparator - comparing()
	

}
