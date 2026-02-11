package multiThread;

public class ThreadClass extends Thread {

	//thread safe                   not thread safe
	
	//synchronized                  supporting multiThread
	
	//slow execution				fast execution
	
	static int count=0;
	
public void printTest() {
				count++;  //
				System.out.println("Parallel");
				int a=12 ,c=23;
				int b=a+c;
				synchronized(this) { //
					
					System.out.println("By synchronized");
					
				}
		
			System.out.println("Parallel 5");
	
		//System.out.println("Hello");
	}
	
	//method overriding
		public void run() {   //t
			
			for(int i=1; i<=10;i++)
			{
				//printTest(); //t
				System.out.println("Child Thread :"+i);
			}
			
		}
	
	public static void main(String[] args) throws InterruptedException { //main thread
	
		ThreadClass t1 = new ThreadClass();
		ThreadOne t2 = new ThreadOne();
		
		t1.start();
		t2.start();
		t1.setPriority(1);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//t1.setPriority(1); //1 to 10    - 5
		
		
		
		//System.out.println(t1.getState()); //RUNNABLE
		
		//java.lang.IllegalThreadStateException
		
		
		//Runnable  - it is doable 
		
		//Running  - i am doing
		
		//join() -- to join two thread result
		
		t1.join();   // 1000 + 1000
		
		t2.join();
		
		//System.out.println(t1.getState()); //TERMINATED
		
//	for(int a=1;a<10;a++) {
//			System.out.println("Main Thread : "+a);
//			//count++;
//		}
//		
//		System.out.println("Count : "+count);
		//sequence process or thread 
		
		//t1.test()   - single thread 
		//for()
		//main()  - single thread
		
	}
}
