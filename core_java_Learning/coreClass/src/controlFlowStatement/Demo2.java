package controlFlowStatement;

interface Demo2{
	
	//abstract method ();
	
	private void test5() {
		
		System.out.println("From 5");
		
	}
	
	public final static int a=12; //public final
	
	 void test4();  //public abstract 
	
public default void test(){
		
		System.out.println("By Test class");
	}
	
static void test2() {
		System.out.println("Test 2");
	}

public static void main(String[] args) {
	
	//Demo2 d1 = new Demo2(); 
	
	Demo2 d = new Demo2() {
		
		@Override
		public void test4() {
			
			System.out.println("By anonymous");
			
		}
	};
	
	d.test4();
	
	d.test5();
	
	d.test();
	
	test2();
	
}

	
}