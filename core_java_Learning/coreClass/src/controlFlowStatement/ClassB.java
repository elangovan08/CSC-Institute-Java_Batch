package controlFlowStatement;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

public class ClassB {

	public static void main(String[] args) {
		
		ClassA ca2 = new ClassA();
	
		//ClassNotFoundException
		
		try {
			Class.forName("c://User//ClassC.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //to load the driver or particular class
		
		
		try {
			Method mt = String.class.getMethod("hello");
			
			System.out.println(mt);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			System.out.println(e+" method not there");
		} 
		
//		try {
//			ca2.readFile();
//		} catch (FileNotFoundException e) {
//			System.out.println("Please give correct location ");
//			
//		} 

	}

}

                      


