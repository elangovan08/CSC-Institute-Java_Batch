package static_AccessModifiers;

import multiThread.TestTwo;


interface Demo{
	
	void run4(); //public abstract

}

public class TestOne extends TestTwo{

	
	public static void main(String[] args) {

		Demo d = new Demo() {

			int a = 23;

			String d2 = "Dinesh";

			@Override
			public void run4() {

				System.out.println("Abstract method :" + d2);
			}

			public void run2() {

				System.out.println("By abstract method : " + a);
			}

			{
				run2();

				System.out.println("by instance");
			}

			static {
				System.out.println("by static");
			}

		};

		d.run4();
		
		//System.out.println(d.a);
		
		//System.out.println(d.d2);
		
		
		TestOne to = new TestOne();
	
		//to.run2();
			
		//to.demo();
		
		//System.out.println(to.s); //The field TestTwo.s is not visible
		
		
//		StaticDemo sd = new StaticDemo();
//		
//		System.out.println(sd.num);
//		System.out.println(sd.sName);
		
		//StaticDemo.test();
		
		//System.out.println(StaticDemo.name);
		
	}

	private void run2() {
		// TODO Auto-generated method stub
		
	}

}

//core java  JSE  -- java standard edition (1.7)

//LTS - 8 ,11 ,17 ,21 ,25

//STS - 


			//j2EE --- java enterprise edition (8)
	
//jsp , jpa , xml

//DI 

//Spring core , Spring boot  

//Hibernate 

//Fullstack: 

//MEAN   -- MERN

//Front  - react.js   ---BE -- java   ---DB ---sql


