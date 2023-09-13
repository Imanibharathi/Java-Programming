package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\Mani Bharathi Raja\\Desktop\\MainApp.txt");
		if(f.createNewFile()) 
		{
			System.out.println("File successfully created");
		}
		else
		{
			System.out.println("File already exist");
		}

	}

}
