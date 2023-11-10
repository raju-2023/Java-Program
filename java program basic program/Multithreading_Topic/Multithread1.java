package Multithreading_Topic;
//Single Thread Example...............
class A extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Akhilesh");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class Multithread1
{

	public static void main(String[] args) throws InterruptedException
	{
		A t = new A();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ankush");	
			Thread.sleep(1000);
		}
	}

}
