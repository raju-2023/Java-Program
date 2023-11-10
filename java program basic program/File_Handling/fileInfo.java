											/* File Information*/
package File_Handling;
import java.io.*;
public class fileInfo 
{

	public static void main(String[] args) 
	{
		File f = new File("E:\\LC.txt");
		if(f.exists())
		{
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writable: "+f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File Size: "+f.length());
			System.out.println("File Removed: "+f.delete());
		}
		else
		{
			System.out.println("File Doesn't Exists");
		}
	}

}

/*Output:
 * 
			File Name: LC.txt
			File Location: E:\LC.txt
			File Writable: true
			File Readable: true
			File Size: 12
			File Removed: true
*/
