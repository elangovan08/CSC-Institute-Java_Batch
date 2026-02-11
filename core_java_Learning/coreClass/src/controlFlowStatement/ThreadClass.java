package controlFlowStatement;

interface Demo{
	
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
	
	Demo d = new Demo() {
		
		@Override
		public void test4() {
			System.out.println("By anonymous");
			
		}
	};
	
	d.test4();
	
}
}

class ThreadTwo implements Demo{   //The public type ThreadTwo must be defined in its own file

	void test3() {
		
		System.out.println("Test 3 by child");
	}
	
	@Override
	public void test4() {
		System.out.println("By threadclass");
		
	}
}	
public class ThreadClass extends ThreadTwo implements Demo{  //implements Demo
	
	//Override
	public void test4() {
		System.out.println("By threadTwo");
	} 
	
	
public static void main(String[] args) {
	Demo td = new ThreadClass(); 
	
	td.test4();
	
}
}
	
		//a =33;  //The final field Demo.a cannot be assigned
		
	//	System.out.println(a);
		
		//td.test();
		//
		
		//td.test();
		//Demo.test2();
		//child
		//td.test3();
		
		
//		Thread t = new ThreadClass("fileOne.mp3");
//		Thread t = new ThreadClass("fileTwo.pdf");
//		Thread t = new ThreadClass("fileThree.mp4");
//		
		



//Thread -class  //Runnable - interface


//Processes  - Eclipse, Chrome ,Teams   

//MultiTasking - opening multiple tab

//Thread  - unit of process - 


//Simultaneous - Video game , 3d game ,      	

//MultiThread is one of the java Feature 

//Concurrent implementations - achieved by MultiThreading in java    

