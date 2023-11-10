						/*Read Data from a File*/

package File_Handling;

import java.io.*;

public class fileReader 
{

	public static void main(String[] args) 
	{
		try
		{
			FileReader r = new FileReader("E:\\LC1.txt");
			try
			{
				int i;
				while((i = r.read()) != -1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				r.close();
				System.out.print("(File Closed!!!!!!!!!!)");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled....!");
		}

	}

}
