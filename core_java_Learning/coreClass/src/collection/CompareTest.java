package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(212);  //212%10  =2
		al.add(601);  //601%0  =1
		al.add(354);
		al.add(200);
		//System.out.println("Before sorting : "+al);
		
	//	Collections.sort(al);
		System.out.println("After sorting : "+al);
		
		//Collection - interface -List ,Set  - Map
		
		//Collections - class
		
		Comparator<Integer> c = ((num1,num2)-> num1%10>num2%10 ? 1:-1);   //Ternary operator
				
//					//2      //1
//				if(num1%10>num2%10) {
//					return 1;  //200 601  212 354   //1 - do swap 
//				}
//				else{
//					return -1;                      //-1 - don't swap
//			
		
		//python ,js
		//Arrow function ()->
												
		Collections.sort(al, c);  // c.compare(al.num1,al.num2) 
		System.out.println(al);

	}

}

//Comparator<Integer> c = new Comparator<Integer>() {
//
//	@Override 
//	public int compare(Integer num1, Integer num2) {
//		
//			//2      //1
//		if(num1%10>num2%10) {
//			return 1;  //200 601  212 354   //1 - do swap 
//		}
//		else{
//			return -1;                      //-1 - don't swap
//		}
//	}
//
//};
//										
//Collections.sort(al, c);  // c.compare(al.num1,al.num2) 
//System.out.println(al);

