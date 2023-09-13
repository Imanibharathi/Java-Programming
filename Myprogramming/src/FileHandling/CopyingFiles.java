package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFiles {

	public static void main(String[] args) throws IOException
	{
		FileInputStream r = new FileInputStream("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainApp.txt");
		FileOutputStream w = new  FileOutputStream("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainJo.txt");
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}
		System.out.println("Data Successfully copied");

	}

}
