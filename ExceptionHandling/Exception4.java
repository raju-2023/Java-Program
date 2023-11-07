package ExceptionHandling;

class Raju
{
	public void a() throws Exception
	{
		
			b();
		
	}
	public void b() throws Exception
	{
		int num1 = 8;
		int num2 = 0;
		
		int result = num1 / num2;
		System.out.println(result);
		
	}
}

public class Exception4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Raju obj = new Raju();
		try
		{
			obj.a();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}
