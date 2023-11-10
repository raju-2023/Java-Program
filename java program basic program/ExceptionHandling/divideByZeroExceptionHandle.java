package ExceptionHandling;

public class divideByZeroExceptionHandle 
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		int a=10,b=0,c;
		try 
		{
			c=a/b;   //10/0
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Can't divide by zero.");
		}
		
		System.out.println("main method ended");
		
	}

}
