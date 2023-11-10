package ExceptionHandling;
public class TryCatchFinallyInsideFinallyBlock
{
	public static void main(String[] args) 
	{
		try
		{
			String a = "ankit";
			System.out.println(a.toUpperCase());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				System.out.println(10/2);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a);
			}
			finally
			{
				System.out.println("Learn code");
			}
		}
		System.out.println("main method ended");
	}
}
