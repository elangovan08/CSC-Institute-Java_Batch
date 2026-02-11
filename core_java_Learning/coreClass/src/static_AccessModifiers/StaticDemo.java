package static_AccessModifiers;

  class StaticDemo {

	int num=44; //non static  - object specific value
	
	String sName;  //instance //non static //object specific info
	int stdAge;
	
	static String name="Arun";
	
	static int f;
	
	public StaticDemo() {
		System.out.println(name);
		System.out.println(num);
	}
	
  static    //class specific info
  {
	  //static block
	  
	 // sName="hi"; //Cannot make a static reference to the non-static field sName
	  
	  int a =21;
	  System.out.println("By static block");
  }	
  
  { //instance block
	  
	  System.out.println(f);
	  f =11;
	  
	  //System.out.println(a);
	  
	  sName ="Naveen";
	  
	  System.out.println(sName +" By instance block");
	  
	System.out.println("By instance block");  
  }
	
  //static - class info
  
  //static block    vs   static main method
	
	public static void main(String[] args) {
		
		StaticDemo sd = new StaticDemo();//to initializing object reference(non static variable) value
		
		System.out.println(name);
		
		  System.out.println(sd.sName +"By main");
		
	System.out.println("static main method");
//		
//		System.out.println(sd.num);
		
		test(sd);
		
		sd.test2();
		
	}
	private static void test(StaticDemo sd) {
		
		System.out.println(sd.num);
		
		System.out.println(name);
		
	}
	
	 void test2() 
	
	{	
		 System.out.println(f);
		System.out.println("From sd class");
		
	}
	
	
	
}
//private - within the class ---  (variable ,method , constructor) 

//public  - access in anywhere (project) ---- (class ,variable ,method , constructor) 

//default - in same package --- (class , variable ,method , constructor) 

//protected  - in same package and subClass in another package ---- (variable ,method , constructor)  




