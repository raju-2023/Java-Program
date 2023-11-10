									/* Rename a File*/
package File_Handling;
import java.io.*;
public class renameFile 
{

	public static void main(String[] args) 
	{
		File f = new File("E:\\raju.txt");
		File r = new File("E:\\kushwah.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File Doesn't exists..!");
		}
	}

}
