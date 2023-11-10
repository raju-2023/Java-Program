package ExceptionHandling;
public class ThrowAndThrows 
{
	void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c = a/b;
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) 
	{
		ThrowAndThrows t = new ThrowAndThrows();
		t.div(20,2);
	}
}
