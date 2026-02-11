package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\test\\test2\\hello.txt"); 
		//file.mkdir();
		//file.mkdirs();
		file.createNewFile();
		//file.delete();
		
		
		//IO  - character Stream -pdf ,txt  
		FileWriter fw = new FileWriter(file,true);
//		fw.write(68); 
//		fw.flush();
//		fw.close();
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("Welcome Hello java");
//		bw.flush();
//		bw.close();
//		
		FileReader fr = new FileReader(file);
//		 int s =fr.read();
//		
//		while(s!=-1) {
//			System.out.print((char)s);
//			s =fr.read();
//		}
		BufferedReader br = new BufferedReader(fr);
		String line =br.readLine();
		while(line!=null) {
			System.out.println(line);
			line =br.readLine();
		}
		
			
	}
	//Byte Stream	- image, audio video
	private static void copyAnImage() throws IOException {
		File f = new File("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\Thread_Life_Cycle.jpg"); //Thread_Life_Cycle
		FileInputStream fis = new FileInputStream(f);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Elangovan\\Desktop\\CSC_JAVA_BATCH\\TLC.jpg");
		
		int byteData=fis.read();
		while(byteData!=-1) {
			fos.write(byteData);
		}

}}
