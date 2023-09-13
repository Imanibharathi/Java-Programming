package FileHandling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WritingFile {

	public static void main(String[] args) throws IOException
	{
		/*FileWriter f = new FileWriter("C:\\Users\\Mani Bharathi\\Desktop\\MainApp.txt");
		f.write("Java is a high level,Object Oriented ,Platform Independent Programming language");
		System.out.println("Successfully data writed in a file");
		f.close();*/
		
	    FileOutputStream f = new FileOutputStream("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainApp.txt");
		String name = "Java is used in Bussiness layer";
		byte []b = name.getBytes();
		f.write(b);
		System.out.println("Successfully writed");
		f.close();
		
		/*Writer w = new FileWriter("C:\\Users\\Mani Bharathi\\Desktop\\MainApp.txt");
		BufferedWriter bf = new BufferedWriter(w);
		bf.write("Kediii is working now in Hyderabad");
		System.out.println("Kediii Successfully writed in a file");
		bf.close();*/
		
		/*PrintWriter pw = new PrintWriter("C:\\Users\\Mani Bharathi\\Desktop\\MainApp.txt");
		pw.write("Kediiii is not sleeping.Right now kediiii is  working in company night shift enjoy");
		System.out.println("Doing  working");
		pw.close();*/
	

	}

}
