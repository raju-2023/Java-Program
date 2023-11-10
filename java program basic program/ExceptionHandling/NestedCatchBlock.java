package ExceptionHandling;
public class NestedCatchBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
			try 
			{
				String a ="RAJU";
				System.out.println(a.toLowerCase());
			}
			catch(NullPointerException n)
			{
				System.out.println("Null value can't converted");			}
		}
		System.out.println("Main method ended");	
	}
}
