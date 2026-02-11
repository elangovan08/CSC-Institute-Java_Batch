package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLearning {

	public static void main(String[] args) throws IOException {
		
		
		//File - to create file on the specific location
		
		//To Write and read operation - characters
		
		//FilWriter
		//FileReader
		
		//BufferedWriter
		//BufferedReader
		
		
		//To read , write operation - image , audio , video
		
		//FileInputStream 
		//FileOutputStream
	
		File file = new File("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\fileHandling\\test\\test2\\demo.txt"); 
		//fileHandling
		//file.mkdir();   //single folder creation
		//file.mkdirs();  //Nested folder creation
		//file.delete();
		file.createNewFile();  //Unhandled exception type IOException
		try(FileWriter fw = new FileWriter(file,true)){
//		fw.write(65);
//		fw.flush(); //to confirm the write operation 
//		fw.close(); //to ensure write the content
		
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write(" Everyday i learn java language at 8pm");
//		bw.flush();
//		bw.close();
		
		FileReader fr = new FileReader(file);
//		int s=fr.read();
//		while(s!=-1) {    //
//		System.out.print((char)s);
//		s=fr.read();
//		}
	
		
		BufferedReader br = new BufferedReader(fr);
	 String cc=	br.readLine();
		//System.out.println(cc);
		while(cc!=null) {
			System.out.println(cc);
			cc=	br.readLine();
		}
		
		copyAnImage();
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}

	//
	private static void copyAnImage() throws IOException {
		File f = new File("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\Thread_Life_Cycle.jpg"); //Thread_Life_Cycle
		FileInputStream fis = new FileInputStream(f);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\TLC.jpg");
		
		int byteData=fis.read();
		while(byteData!=-1) {
			fos.write(byteData);
		}
		
		fis.close();
		fos.close();
		System.out.println("Image copied");
	
	}

}
//How to create a folder

//How to create a SubFolder

//How to create file

//How to write on the existing file or with our creation file

//write the data char by char

//write data line by line

//read the file with char by char

//Reading data line by line

//How to copy an image and storing it in another location with new name and another extension 

