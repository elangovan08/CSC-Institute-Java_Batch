package multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestOne extends Thread{

	static int count=0;
	
	public void testing() {
		count++;	
	}	
	public void run() {
		
		for(int i=0; i<50330;i++) {
			testing();
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException, CloneNotSupportedException {
	
		Thread t1 = new TestOne();
		Thread t2 = new TestOne();
		

    t1.start();
    t2.start();
	System.out.println("Count of num :" +count);	
	
	}
}


//start()  -- to create new thread
//	run()    -- runnable thread

//Two way to achieve MultiThread:

//Thread - class     ---- Runnable-interface 



//stack memory 

//local variable

//method

//Last in First Out  -Stack

//pop()  push() 


//demo()

//develop() 

//test()

//main()



//Object 

//Concurrency - Doing more task at a same time

//MultiThreading - more than one thread or many thread at a same time

//Thread - single task in a process   

//main method - is single thread 


//process  - thread - task