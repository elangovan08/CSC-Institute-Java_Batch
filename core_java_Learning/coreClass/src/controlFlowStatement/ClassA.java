package controlFlowStatement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassA {

	//Exception -is  Object 
	
	//What is Exception - An abnormal event which is interrupt program flow
	//					 whenever exception occurs , an object which is related to the exception
	//                   will be thrown(JVM) to the user 
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ClassA ca = new ClassA();
		ca.readFile();
		
		//try catch
		
	}
	public void readFile()  {
		
		//Checked exception - compile time exception 
		File file = new File("C:\\Users\\text.txt");
		
		
		//try with resource
		
		try(FileInputStream is = new FileInputStream(file)){
			
			//read write
		} //path

		catch(Exception e) {
			
		}
	
	}

}
