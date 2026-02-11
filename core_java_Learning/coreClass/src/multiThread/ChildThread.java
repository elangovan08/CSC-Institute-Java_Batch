package multiThread;

public class ChildThread extends Thread{

	public void run() {
	
		for(int i=1;i<=5;i++) {
			//Thread.yield();  //giving its priority to other threads 
			System.out.println("ChildThread : "+i);
		}
		
	}
	
	//run() -running state  ---sleep()  
	
	//sleep() - waiting state---waiting to runnable -runnable to running  
}
