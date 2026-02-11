package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetAndMapLearning {

	public static void main(String[] args) {
		
		//Set - Interface
		
		//implemented classes -HashSet ,LinkedHashSet,TreeSet
		
		
		//Set - is not maintaining order , Not allow duplicates values
		
		//HashSet - won't maintain order ,and not allow duplicates
		
		//LinkedHashSet -maintain insertion order ,and not allow duplicates
		
		//TreeSet - maintain natural order or ascending order ,not allow duplicates 
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();  //Homogeneous 
		set.add(33);
		set.add(44);
		set.add(54);
		set.add(22);      //typeCasting  -converting one primitive dataType to another
		set.add(66);
		set.add(78);   // java.lang.ClassCastException:
		
		System.out.println(set);
		
		Iterator it =set.iterator();  //33 83 43 55 78 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(set);

//-------------------------------------------------		
		
	//Map -interface  ----> key - value pairs
		
	//Implemented classes - HashMap ,LinkedHashMap,TreeMap	
		
	//keys - are unique 
	
	//values - can contains duplicates
		
	//			   key  - values
		
	//example --> Lenovo - 40000
	//		  --> HP     - 40000 	
	//		  --> Lenovo - 40000 //x	
		
	//Duplicates are not allowed by key ,if there it will be override at the position
		
		//HashMap hm = new HashMap();
		//Duplicates are not allowed
		//order will not be maintain , giving random order
		
		
		//LinkedHashMap hm = new LinkedHashMap();
		//Insertion order will be maintain in LinkedHashMap 
		//Duplicates are not allowed
				
		TreeMap<String,String> hm = new TreeMap();
		//Order will be maintain by keys 
		//Duplicates are not allowed
		hm.put("Lenovo", "40000");
		hm.put("Hp", "50000");
		hm.put("Dell", "60000");
		hm.put("Asus", "40000");
		hm.put("Lenovo", "50000");
	    //System.out.println(hm);
		//System.out.println(hm.get("Lenovo"));
		//System.out.println(hm.containsKey("Dell"));
		//System.out.println(hm.containsValue("60000"));
		//System.out.println(hm.keySet());
		//System.out.println(hm.values());
			
//-----------------------------------------------		
		
		//Wrapper class
		
				//Short - short
				//Byte - byte
				//Character - char
				//Boolean - boolean
				//Integer - int
				//Float - float
				//Long - long
				//Double - double
	}

}
