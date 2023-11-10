//Here exception handle by try-catch

package ExceptionHandling;
public class TryCatchVsThrows 
{
	public static void Wait() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"  ");
			Thread.sleep(1000);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		try
		{
			Wait();
			System.out.println(10/0); 
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Main method ended");
	}
}


/*
Output:
	1  2  3  4  5  6  7  8  9  10  
	Exception handled
	Main method ended
*/
