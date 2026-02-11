package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Invalid '@FunctionalInterface' annotation; Demo is not a functional interface

@FunctionalInterface
interface Demo{
	
	int test(int a,int b);

}

public class ComparatorMethod implements Demo{

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(233); //3
		list.add(422); //2
		list.add(304); //4
		list.add(101); //1
		
		//abstract method - Comparator<T>.compare(T, T)
		
		//Comparator<Integer> c = (num1,num2)-> num1%10>num2%10?1:-1; 	
	
		
		Demo d = (a,b)-> a+b;
		
		System.out.println(d.test(23, 22));
	//	[101, 422, 233, 304]
			
			//101
			
			//422
		
			//233
			
			//304
	Collections.sort(list,(num1,num2)-> num1%10>num2%10?1:-1);  //c.compare(l1,l2)  //  compare(l1,l2)
		System.out.println(list);

	}

	@Override
	public int test(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
//	public void test(int a, int b, int c) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
//Comparator<Integer> c = new Comparator<Integer>() {
//
//	@Override
//	public int compare(Integer num1, Integer num2) {
//		
//		//	4   > 3 	
//		if(num1%10>num2%10) {
//			
//			return 1;  //do swap    233
//		}
//		else {
//			return -1; //
//		}
//		
//	}
//
//};
