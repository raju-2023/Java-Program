							/*Write on File*/
package File_Handling;
import java.io.*;
public class fileWriter 
{

	public static void main(String[] args) 
	{
		try
		{
		FileWriter f = new FileWriter("E:\\LC1.txt");
			try
			{
				f.write("Java Programming is the best Language..!");
			}
			finally
			{
				f.close();
			}
		System.out.println("Succesfully Data Wrote in File");
		}
			
		catch(IOException i)
		{
			System.out.println(i);
		}

	}

}
