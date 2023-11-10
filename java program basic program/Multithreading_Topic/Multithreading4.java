package Multithreading_Topic;
class D extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		try
		{
			
		
			for(int i=1;i<=3;i++)
			{
				System.out.println(n);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException i)
		{
			
		}

	}
}
public class Multithreading4 
{

	public static void main(String[] args) 
	{
		D t1 = new D();
		D t2 = new D();
		D t3 = new D();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
