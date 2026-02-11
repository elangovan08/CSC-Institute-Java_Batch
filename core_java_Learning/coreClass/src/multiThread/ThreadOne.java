package multiThread;

public class ThreadOne extends Thread {

	static int count=0;

	//synchronized
	
	public void printTest() {
		
		System.out.println("Thread " +count);
		
		synchronized(new ThreadOne()) 
		{   //t
		count++;  //5000
		}
	
		//System.out.println("Hello");
	}
	
	//method overriding
//		public void run() {   //t
//			
//			for(int i=0; i<=10;i++)
//			{
//				printTest(); //t
//				
//			}
//			
//		}
//		
		public void run() {
			for(int a=1;a<10;a++) {
				
				System.out.println("Main2 Thread : "+a);
			}
				//count++;
			}
		
	public static void main(String[] args) throws InterruptedException { //main thread - single thread
		
		ThreadOne t = new ThreadOne();
		ThreadOne t2 = new ThreadOne();
		
		System.out.println(t.getState());
		
//start()  //run()  //sleep()  //join()  //synchronized method and block
		
		t.start(); //5000  //start() {  t.run()   }
		t.setPriority(5);
		//t.start();

		//ThreadState
		// java.lang.IllegalThreadStateException
		
		
		t2.start();//5000
		
		t.join(); 
		t2.join(); 
		 
		//10000
		
		System.out.println(count);
//		for(int i=1; i<10000;i++) {
//			count++;
//		
//		}		
	}
	//run()
	//for
	//main() //sequence process  - by threads
	
}

//thread  <---> jvm <----> Thread scheduler <----> os , processor ,ram ,rom 

//Thread scheduler - to allocate time for an thread implementations from os , processor ,ram ,rom 

//jdk - javac  jre   jvm - platform dependent - os , processor ,ram ,rom

//A process will be run by at least one thread that is called main thread
