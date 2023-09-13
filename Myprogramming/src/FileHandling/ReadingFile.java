package FileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException
	{
		/*FileReader f = new FileReader("C:\\Users\\Mani Bharathi\\Desktop\\MainApp.txt");
		int i;
		while((i=f.read())!=-1) 
		{
			System.out.print((char)i);
		}
		f.close();*/
		FileInputStream f = new FileInputStream("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainApp.txt");
		int i;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}

	}

}
