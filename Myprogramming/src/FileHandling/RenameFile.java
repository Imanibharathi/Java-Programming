package FileHandling;

import java.io.File;
import java.io.IOException;

public class RenameFile {

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("C:\\Users\\Mani Bharathi\\Desktop\\MainApp.txt");
		File f2 = new File("C:\\Users\\Mani Bharathi\\Desktop\\MainJo.txt");
		if(f2.exists())
		{
			System.out.println(f2.renameTo(f1));
		}
		else
		{
			System.out.println("File doesn't exist");
		}

	}

}
