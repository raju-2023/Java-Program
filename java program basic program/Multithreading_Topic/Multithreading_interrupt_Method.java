package Multithreading_Topic;
class H extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("t1 thread running");
				Thread.sleep(1000);   //waiting
			}
		}
		catch(InterruptedException i)
		{
			System.out.println("t1 thread is terminated..!");
		}
	}
}
public class Multithreading_interrupt_Method
{

	public static void main(String[] args) 
	{
		H t1 = new H();
		t1.start();
		t1.interrupt();

	}

}
