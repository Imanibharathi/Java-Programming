package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileInformation {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainApp.txt");
		if(f.exists())
		{
			System.out.println("File name : "+f.getName());
			System.out.println("File Path : "+f.getAbsolutePath());
			System.out.println("File writable : "+f.canWrite());
			System.out.println("File readable : "+f.canRead());
			System.out.println("File size : "+f.length());
			System.out.println("File deleted : "+f.delete());
		}
		else
		{
			System.out.println("File doesn't exists ...");
		}
		

	}

}
