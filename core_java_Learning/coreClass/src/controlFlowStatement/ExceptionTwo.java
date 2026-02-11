package controlFlowStatement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ExceptionTwo {

	public static void main(String[] args)    {
	
		ExceptionTwo et = new ExceptionTwo();
		
		try {
			Method method =String.class.getMethod("hashCode");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	try {
		
		try {}
		catch(Exception e) {
			
		}
		et.readFile();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println();
		String path="C:\\Users\\hello.py";
		FileReader fd;
		try {
			fd = new FileReader(path);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //
		//BufferedReader br = new BufferedReader(fd);
	}
	
	}
	//throws  - to throw exception from where the method call
	
public void readFile() throws FileNotFoundException  {

//     File file = new File("C:\\Users\\text.txt"); //path
//
//	FileInputStream is = new FileInputStream(file); //file  not there
//		
	String path="C:\\Users\\hello.py";
	FileReader fd = new FileReader(path); //
	BufferedReader br = new BufferedReader(fd);

	}

}

//try,catch,finally 

//Checked Exception - compile time exception

//Checked Exception will be handled at compile time

//----------------------------

//Unchecked Exception -Runtime Exception

//UnChecked Exception will be handled at Runtime

