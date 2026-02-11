package interfaceTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Serializable - Converting java object into byte stream 

//DeSerializable - Converting byte stream into java object  

//interface  - Normal interface , 
//           - Functional Interface (SAM) - Single Abstract Method 
//			 - Marker interface  - interface without no method  - Serializable  , CommandLineInterface

@FunctionalInterface
interface Learn{   //Invalid '@FunctionalInterface' annotation; Learn is not a functional interface
	
	double test(double a, int b , int c);
	//void test4();
	
 static void test2() {
	//concrete method 
 }	
 default void test3() {
	 
 }

}

//System.in  - user input

//System.out - console output

//main(String[] args)



//java 8  - Functional Interface ,Lamda Expression , StreamAPI ,DateTime API ,static - default interface
public class InerterfaceLearning {

	
	public static void main(String[] args) {
	
		//Stream API
		List<String> ss = List.of("Hello java" ,"Learning");
		
		ss.stream()
		  .map(String::toUpperCase)
		  .forEach(System.out::println);
		
		List<Integer> ls = Arrays.asList(23,3,12,33);
	long c=	ls.stream()
		  .filter(s -> s>10)
		  .count();	
		System.out.println(c);
		
		ls.stream()
				  .filter(s -> s>10)
				  .sorted()
				  .forEach(System.out::println);
		
//------------------------------------------------------	
		String[] s1 = {"d","s"};
		
		Scanner s = new Scanner(System.in);
		
		Learn l =(x , b , v)->(x+b);  //return 34
		
		l.test(23, 11,44);
		System.out.println();
		try {
			System.out.println(12/0);
			
			int[] arr = new int[3]; //0 1 2 
			arr[5] =12;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.exit(0);	//To stop jvm
		}
		
		finally {
			System.out.println("Finally block");
		}
		
	}

}

//class CMDLine{
//
//public static void main(String[] a){
//
//commandLine Argument
//for(int i=0;i<a.length;i++){
//	
//	System.out.println(a[i]);
//}
//
//
//}
//}

//Learn l = new Learn(){
//
//	@Override
//	public void test() {
//		System.out.println("By Learn interface");
//		
//	} 
//	
//};


//java introduction

//jdk jre jvm

//OOP - class , object, Inheritance ,Encapsulation ,PolyMorphism ,Abstraction 

//Constructor

//package , import

//TypeCasting

//static-dynamic binding

//static , instance block

//final keyword

//setter() getter()

//this() super()

//Interface - SAM , Marker interface

//Array

//String classes

//java memory management

//Conditional statement or flow

//static - non static , DataType 

//Functional interface and Lamda Expression

//Anonymous class with scope

//Exception Handling

//MultiThreading

//Collection API

//hashCode() equals() toString()

//File Handling

//Stream API

//CommandLine Args , System in and out , .exit()

//REGEX , JDBC 
