package ExceptionHandling;
public class NumberFormatExceptionHandle 
{
	public static void main(String[] args) 
	{
		String str = "raju kushwah";
		try {
		int a = Integer.parseInt(str);
		System.out.println(a);
		
		}
		catch(NumberFormatException n)
		{
			System.out.println("String "+str+" can't be converted to integer");
		}
		System.out.println("main method ended");
	}
}


