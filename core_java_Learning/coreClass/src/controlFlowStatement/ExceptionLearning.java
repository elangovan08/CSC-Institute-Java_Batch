package controlFlowStatement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionLearning {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		//Checked Exception - Compile Time Exception
		
		//Checked Exception will be Handled at compileTime
		
			try {
				FileReader file = new FileReader("c://resume.docs");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//		java.io.FileNotFoundException: c:\resume.docs (The system cannot find the file specified)
//		Enter Two nums : 
//			at java.base/java.io.FileInputStream.open0(Native Method)
//			at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
//			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
//			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
//			at java.base/java.io.FileReader.<init>(FileReader.java:60)
//			at core_java_Learning/controlFlowStatement.ExceptionLearning.main(ExceptionLearning.java:19)

			//Unhandled exception type FileNotFoundException
	
		
		//UnChecked Exception  - Runtime Exception 
				
		//UnChecked Exception will be handled at Runtime
		
			try {
//				System.out.println("Enter two numbers : ");
//				int y= scan.nextInt(); //12
//				int x=scan.nextInt(); //0
//				int z =y/x;
//				System.out.println(z);
				
				//NullPointerException
//				String name="hello"; //
//				System.out.println(name.charAt(2));
				
				//ArrayIndexOutOfBoundsException
//				int[] arr = new int[3]; //0 1 2 
//				arr[5] =12;
				
				//ArithmeticException
			System.out.println("Enter Two nums : ");
            	int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int divide =num1/num2;
			
		}
			
//		catch (NullPointerException ne) {
//			System.out.println("Print name properly :");
//			String name = scan.next();
//			System.out.println(name.charAt(3));
//		}
//			catch (ArithmeticException ae) {
//			System.out.println("Enter valid numbers");
//		    int num3 = scan.nextInt();
//			int num4 = scan.nextInt();
//			int divide = num3 / num4;
//			System.out.println(divide);
//		} 
//		catch (ArrayIndexOutOfBoundsException obj) {
//			System.out.println("Print limit of array");
//			}
//			
		finally {	
		      System.out.println("Finally block always called even exception catch or not ");
		      }	
	
		//Exception - 
		
	//An abnormal event occurs during run time. this cause the program to
	//stop immediately

	//Whenever exception occurs ,an object which is related 
	//to the exception will be thrown (by jvm )to the user.   	
	}

}
//java intro

//Class ,Object

//DataTypes ,Variable

//static ,final  

//Package ,import

//OOP -Abstraction , Inheritance , PolyMorphism , Encapsulation

//Interface ,Constructor

//this() super()

//Static binding ,Dynamic Binding 

//Getter() and Setter() method

//ControlFlow Statement

//String , Array

//Exception Handling



