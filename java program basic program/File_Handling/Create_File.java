
				/* Create a File*/
package File_Handling;

import java.io.*;

public class Create_File 
{
	public static void main(String[] args) throws IOException  //Here we can handle exception
	{
		File f = new File("E:\\LC.txt");
		if(f.createNewFile())
		{
			System.out.println("File Successfully Create..!");
		}
		else
		{
			System.out.println("File Already Exist..!");
		}
		
		//Other Method to handle Exception
/*		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Successfully Create..!");
			}
			else
			{
				System.out.println("File Already Exist..!");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled.!");
		}
	}
*/		
			
		}

}
