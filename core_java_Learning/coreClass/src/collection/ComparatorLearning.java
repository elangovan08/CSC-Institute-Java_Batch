package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLearning {

	String sName;
	int sId;
	public ComparatorLearning(String sName, int sId) {
		super();
		this.sName = sName;
		this.sId = sId;
	}
	
	public static void main(String[] args) {
		
		ComparatorLearning std1 = new ComparatorLearning("Vinoth",103);
		ComparatorLearning std2 = new ComparatorLearning("Yash",102);
		ComparatorLearning std3 = new ComparatorLearning("Arun",101);
	
		List<ComparatorLearning> list = new ArrayList<ComparatorLearning>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		
		
//		for(Object o :list) {
//			
//			System.out.println(o);
//	
//		}
		System.out.println("Sorted by Name :");
		
		list.sort(Comparator.comparing(s ->s.sName));
		list.forEach(System.out::println);
		
		//System.out.println();
		
		System.out.println("Sorted by Id :");
		list.sort(Comparator.comparingInt(s ->s.sId));
		list.forEach(System.out::println);
	}

	//forEach(System.out::println); -----?
	
	//forEach() -->loop without conditions and called as method -()
	
	//System.out::print   --> to printing each values
	
	//:: --> reference method or double colon
		
	@Override
	public String toString() {
		return "[sName=" + sName + ", sId=" + sId + "]";
	}
}
