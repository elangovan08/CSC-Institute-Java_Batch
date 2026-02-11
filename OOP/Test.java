class Test{

static String name3;

public static void main(String []args){


	String name = new String("Robert"); 
		
		Test ss = new Test();
		
		ss.name3="Robert";  
		
		String name2 ="Robert";  
		
		System.out.println(name2.hashCode()); 
		
		name2="Robert";

		System.out.println(name.hashCode());
		System.out.println(name2.hashCode()); 
		System.out.println(name3.hashCode());
				

}

}