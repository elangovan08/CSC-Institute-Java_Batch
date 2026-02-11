package controlFlowStatement;

import java.util.StringTokenizer;

public class StringBC {

//	static String name3;
//	
public static void main(String[] args) {
//
      String name = new String("Arun");   //Heap
      
      String name2 ="This.is.our.java.class";  
      
     String [] content= name2.split("\\." ,4); //
     
     //Enhanced for loop
     
     for(String ss : content) {
    	 System.out.println(ss);
     }
     
     
//      String name3 ="PM"; //SCP
//      String name4 ="PM"; //
//      String name5 ="PM";
//      String name6 ="PM";
//      String name7 ="PM";
//      
//      
//     System.out.println(name2.hashCode());
//     System.out.println(name3.hashCode());
//     System.out.println(name4.hashCode());
//     System.out.println(name5.hashCode());
//     System.out.println(name6.hashCode());
//     System.out.println(name7.hashCode());
//      
//      name2="CM";
//      System.out.println(name2.hashCode()); //2154
////      
//     name = name.intern();//SCP
//      
//      String name2 ="Arun"; //SCP
//      System.out.println(name2.hashCode());
//      
//      StringBC bc = new StringBC();
//      bc.name3="Arun";  //SCP
//      
//      System.out.println(name3.hashCode());
//		
//		//==  - Comparing memory reference
//       //equals()  - Comparing values
//      //hashCode() - comparing values 
//      
//      if(name==name2) {
//    	  System.out.println("Both are =");
//      }
//      else {
//    	  System.out.println("Not ="); 
//      }
//      

//  
// String name2 ="Arun";
// System.out.println(name2.hashCode()); //2049706
// 
// 
// name2="Arun";
// System.out.println(name2.hashCode());  //	2049706
//
//	
//	StringBuffer sb = new StringBuffer("Hello");
//	System.out.println(sb.hashCode()); 
//		
//	sb.append("New obj"); 
//	System.out.println(sb.hashCode());
//	
//	StringBuilder sb2 = new StringBuilder("hello");
//	
//	
	//MultiThread  //Single 
	
	//Both are mutable

	
	//System.out.println(sb.append(" world"));
	
	//System.out.println(sb.reverse());
	
	//System.out.println(sb.replace(0, 4, "JJJ"));
	
	//System.out.println(sb.delete(0, 3));
	
	//System.out.println(sb.deleteCharAt(0));
	
	//System.out.println(sb.insert(0, "h"));
	
//	String name2 ="Arun# MJ$Vinoth@Kumar%";
//	
//	StringTokenizer st = new StringTokenizer(name2);
//	
//    System.out.println(st.countTokens());
//	
//    while(st.hasMoreTokens()){  // 0
//    	
//    	System.out.println(st.nextToken()); //1  //2 //3 //4
//    }  
 
 }

}
