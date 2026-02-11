package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
	
		
	//Array class - collection similar dataTypes	
		
	//Collection API - Collection of object
	//Primitives values -
		
	//List , Set , Map  -interface	

		listTest();
		//setTest();
	 	//mapTest();
	
		
	}
	
	private static void mapTest() {
		
		//Map - key value pairs 
		//Key can't be duplicate  
		//values can be duplicates
		
		//implemented classes - HashMap , LinkedhashMap ,TreeMap
		
		//key     value
		
		//Lenevo - 35000 
		//Lenevo - 45000
		//Lenevo2 -35000
		
		HashMap hm = new HashMap();
		//Random order
		//Not allow duplicates by key
		hm.put("Lenevo",35000);
		hm.put("HP",37000);
		hm.put("Dell",37000);
		hm.put("Asus",50000);
		hm.put("Lenevo",37000);
		System.out.println(hm);
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.containsKey("Asus"));
//		System.out.println(hm.containsValue("20000"));
//		System.out.println(hm.entrySet());
		
		HashMap hm2 = new HashMap();
		
		hm2.putAll(hm);
		//System.out.println(hm2);
		
		//LinkedHashSet
		LinkedHashMap ls = new LinkedHashMap();
		ls.putAll(hm2);
		//System.out.println(ls);
		
		TreeMap tm = new TreeMap();
		//Maintain natural order by  key
		tm.putAll(hm2);
		System.out.println(tm);
		
		
		//getter() setter()
		//String 
		//Array
		//operator and conditional statements
		
		
		
	}

	public static void setTest() {
		
		//Set - It does not allow duplicate , Order will not be maintain
		//implemented classes - HashSet ,LinkedHashSet ,TreeSet
		
		HashSet list = new HashSet();
		//Not maintain order 
		//Not allow Duplicates
		list.add(23);
		list.add(true);
		list.add(55.3);
		list.add("Hello");
		list.add(23);
//		list.remove(2);
	
		System.out.println("HashSet: ");
		System.out.println(list);
//		//list.addFirst(44);
//		//System.out.println(list);
//		//list.addLast(67);
//		//System.out.println(list);
//		System.out.println(list.contains(23));
//		//System.out.println(list.getFirst());
//		//System.out.println(list.getLast());
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		//System.out.println(list.reversed());
	
		LinkedHashSet lks = new LinkedHashSet();
		//Maintain insertion order
		lks.add(11);
		lks.add(12.4);
		lks.add(13);
		lks.add(false);
		lks.add(01);
		lks.add("Hello");
		
		//11 12.4 13 false 1 Hello
		
		
		Iterator it =lks.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//11
		}
		
		System.out.println("LinkedHashSet: ");
		System.out.println(lks);
		
		//Wrapper class
		
		//Byte -byte
		//Short -short
		//Integer  -int
		//Boolean  -boolean
		//Long  -long 
		//Double -double
		//Float -float
		//Character -char
		
		//Type Safety - Generics
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//Maintain natural or Ascending order 
		ts.add(44);
		ts.add(33);
		ts.add(42);
		ts.add(88);
		ts.add(42);
		System.out.println("TreeSet: ");
		System.out.println(ts);
		
		//java.lang.ClassCastException
		//TypeCasting - converting one primitive dataType to another primitive dataType
		
	
	}

	private static void listTest() {
		//List
		//Implemented classes of List -ArrayList ,LinkedList 
		//List - Maintain insertion order , Allow duplicates	
		ArrayList list = new ArrayList();	
		list.add(23);
		//list.add(true);
		list.add(55.3);
		//list.add("Hello");
		list.add(23);
		list.remove(1);
		
		list.addFirst(44);
	//	System.out.println(list); 
		list.addLast(67);
		System.out.println("ArrayList");
		System.out.println(list);
	//	System.out.println(list);
//		System.out.println(list.contains(23));
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.reversed());

		HashSet hs = new HashSet(list);
		System.out.println("By HashSet");
		System.out.println(hs);
		
		TreeSet ts = new TreeSet(hs);
		System.out.println("By TreeSet");
		System.out.println(ts);
		
		//ArrayList list2 = new ArrayList();
		
//		list2.addAll(list);
//		System.out.println(list2);
		
		LinkedList ldl = new LinkedList();
		
//		ldl.addAll(list);
//		System.out.println("By LinkedList");
//		System.out.println(ldl);
		
		//[67, 23, Hello, true, 23, 44]
		
		//[44, 23, true, Hello, 23, 67]
		
		
		//ArrayList - Data are depending one by one  
		//Data - retrieve will be fast
		//Insertion and deletion in middle or both side -  
		
		//01 11 22 25 33 44 55
		//0 1 2 3 4 
		
		//DoublyLinkedList
		
		// \ 24 01     01 25  04   04 55 02    02  26  03    03 27 \
		
		
	}

}
