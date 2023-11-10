									/*copy one file data to another*/

package File_Handling;
import java.io.*;
public class copyFile 
{

	public static void main(String[] args) throws IOException             //There is main method caller JVM handle these exception
	{
		FileInputStream r = new FileInputStream("E:\\raju.txt");
		
		FileOutputStream w = new FileOutputStream("E:\\ishan.txt");
		
		int i;
		while((i = r.read()) != -1)
		{
			w.write((char)i);
		}
		System.out.println("Data Copied Successfully..!");
				
	}

}
