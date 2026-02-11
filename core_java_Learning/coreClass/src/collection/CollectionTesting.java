package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionTesting {

	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		
		LinkedList al = new LinkedList();
		al.add(212);
		al.add(43.3);
		al.add("Hello");
		al.add(true);
		al.add('a');
		al.add(212);
		//System.out.println(al);
		al.add(0, 303);
		//System.out.println(al);
		al.addFirst(333);
		al.addLast(777);
		//System.out.println(al.get(0));
		//System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		//System.out.println(al2.indexOf(333));
		//System.out.println(al.reversed());
		
		al2.size();
//		
//		HashSet set = new HashSet();
//		set.add(33);
//		set.add(44);
//		set.add(54);
//		set.add(22); 
//		
		System.out.println(al);
		LinkedHashSet lm = new LinkedHashSet(al);
	 	
		System.out.println(lm);
		
		
		//List to array
	
	//String[] a = ;
	
	Object[] s	= al2.toArray(); //List of object to toArraList
	
	//System.out.println(s); //@ 0 to 9  abcdef  -16
	
//	for(int i=0;i<s.length;i++) {
//		
//		System.out.println(s[i]);
//	}
	//ForEach loop or Enhanced loop
	
//	for(Object o: s) {
//		
//		System.out.print(o+" ");
//	}
	
		//System.out.println(al2);
		//System.out.println(al2.contains(3333));
	//	System.out.println(al2.get(5)); //0 1 2 3 4 5 
		
	}

}
//Collection --> Collection of object 	

//Arrays --> Collection of similar dataType { 12,33,1,2,1}

//Collection - interface

//SubInterfaces of Collection - list ,set ,queue ,deQueue 

//Map interface - Part Collections API

			//API - Application programming interface

			//API call - request , response - Browser



//Collection  - interface

//Collections - class


//						implemented classes of List				

//Collection -> List ---- ArrayList ,LinkedList

//List - Maintain the insertion order 
//	   - Allow duplicates values	



//							implemented classes of Set						

//Collection -> Set  ---- HashSet ,LikenHashSet ,TreeSet

//Set - Not maintain the order 
//    - Values are unique or not allowed duplicates values



//								implemented classes of Map	

//Collection API part -> Map ---- HashMap ,LinkedHashMap , TreeMap 

//Map   -  Stores key values pairs 
//		Key - unique  
//		values - can be duplicates


//DoubledLinkedList - slow in retrieve  , but fast in insertion deletion in middle order

//Nodes

//      / a 2  ----> 2 b 3 ---->3 c 4 -----> 4 d /


//ArrayList - Fast in retrieve but slow in insertion deletion in middle order

// [333, 303, 212, Message , 43.3, Hello, true, a, 212, 777]	


