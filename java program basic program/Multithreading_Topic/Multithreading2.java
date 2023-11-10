package Multithreading_Topic;
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Child Thread");
		}
	}
}
public class Multithreading2
{

	public static void main(String[] args)
	{
		B r = new B();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is Main Thread");
		}

	}

}
