package multiThread;

class WN{  //
	
	//Runnable  -- it is doable
	
	//Running  -- i am doing
	
	//developer is moving a thread from new to runnable state - start()
	
	//jvm moving a thread from runnable to running state - run()
	
	//(JVM)thread scheduler - runnable - running -waiting - runnable - running  
	
	//synchronized method and block - ITC - Inter Thread Communication
	
	public synchronized void waitDemo() { //td
		
		try {
			System.out.println("Thread A : waiting");
			
			wait(); //running to waiting state
			
			// waiting -- runnable -- running 
			
			System.out.println("Thread A : resumed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  public synchronized void notifyDemo() {
		System.out.println("Thread B : notifying");
		notify();  // waiting -- runnable -- running 
	}
	
}

public class MainThread {

	public static void main(String[] args) throws InterruptedException { //main thread
		ChildThread t1 = new ChildThread();
		ChildThread t2 = new ChildThread();
		
		t1.start(); //doing a task
		//t1.join();  //    main thread waiting for child thread until done its job  
		
		
		for(int i=1;i<=5;i++) 
		{
			System.out.println("MainThread : "+i);
		}
		
		
//		WN wn = new WN();
//		
//		// ()->        wn.waitDemo();  //Functional interface   
//		
//		Thread td = new Thread(  ()->wn.waitDemo()   );
//		Thread td2 = new Thread( ()->wn.notifyDemo()  );
//		
//		td.start(); //run() -->{   wn.waitDemo()  }
//		
//		Thread.sleep(2000);
//		
//		td2.start(); //run() -->{ wn.notifyDemo() } 
		
		//System.out.println(t1.getState());
		
//		t1.start();
//		
//		System.out.println(t1.getName());
//		System.out.println(t1.getId());
//		System.out.println(t2.getName());
//		System.out.println(t2.getId());
////		
//		t1.setName("ThreadDemo");
//		System.out.println(t1.getName());
		
		
		//t1.setPriority(1);
		 //1 to 10  -  default 5  ---java.lang.IllegalArgumentException
		
		
		//t1.join();//main thread waiting for t1 thread 

		//System.out.println(t1.getState());

	//start() --->creating new thread --new to runnable   --start(){  run();  }
	
	//run() - running --- i am doing  ----runnable to running state
	
	//sleep() - running to waiting state
	
	//join() - one thread waiting for another thread
	
	//yield() -giving its priority to other threads
	
	//setPriority() 
	
	//wait()
	
	//notify()
	
	//interrupt()
	
	//Synchronized method and block
	
	//jvm -  thread scheduler - platform dependent -os(multitasking) , processor
}
	}
