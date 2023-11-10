package ExceptionHandling;
public class ThrowsException 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			try 
			{
				System.out.println(i);
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
}
