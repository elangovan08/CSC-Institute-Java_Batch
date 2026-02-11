package controlFlowStatement;

public class StringClass2 {

	static String name3;
	
	
	public static void main(String[] args) {
		
		String name = new String("Robert");  // new String  
		
		StringClass2 ss = new StringClass2();
		
		ss.name3="Robert";   //SCP
		
		String name2 ="Robert";  //SCP

	System.out.println(name2.hashCode()); //String Object
		
	//	System.out.println(name2.hashCode()); //String Literal
		
		//System.out.println(name3.hashCode());
		
		//System.out.println(name2);
		
		if(name3==name2) {
			
			System.out.println("Both are =");
		}
		else {
			System.out.println("Not =");
		}
		
	}

}


////System.out.println(name2); //
//
//name2= "Downey Neo Downey";
//
//System.out.println(name2);   //String Immutable
//
//
////name==name2 ---false ? ---comparing memory reference 
//
//StringClass2 s3 = new StringClass2(); //values compare
//
//s3.name3="Robert";  //values 
//
////name2==name3 --true? ---comparing values
//
////Count of specific character occurrence in String
//
////name2= "Downey Neo Downey";
//int count=0;
//
//for(int i =0;i<name2.length();i++) {
//
//if(name2.charAt(i)=='e') {
//	count++;
//}
//}
//System.out.println("Count of e : "+count);
//
////==    -  comparing memory reference 
//
////.equals()   -comparing values
//
////System.out.println(name.equals(name2));
//
//
////	System.out.println(n);
////
//
////s3.str(name2);
//
//}
//
//private void str(String name2) {
//if(name3==name2) {
//	System.out.println("Both are ==");
//}
//else {
//	System.out.println("Not =");
//}
//
//
