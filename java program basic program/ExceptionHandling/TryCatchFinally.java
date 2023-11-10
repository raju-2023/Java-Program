package ExceptionHandling;
public class TryCatchFinally 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Learn coding");
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			System.out.println("like share");
		}
		catch(ArithmeticException a) 
		{
			System.out.println("can't divide by zero");
		}
		finally
		{
			System.out.println("subscribe");
		}
		System.out.println("main method ended");
	}
}

