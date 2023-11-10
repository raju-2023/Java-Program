package Multithreading_Topic;
class E extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
			for(int i=1;i<=3;i++)
			{
				System.out.println(name);
				
			}
	}
}
public class Multithreading5_Join_Method 
{

	public static void main(String[] args) 
	{
		E t1 = new E();
		E t2 = new E();
		E t3 = new E();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		
		t2.start();
		try
		{
			t2.join();   //join halt.....
		}
		catch(InterruptedException i)
		{
			
		}
		 t1.start();
		 t3.start();
		 
		 String name = Thread.currentThread().getName();
			for(int i=1;i<=3;i++)
			{
				System.out.println(name);
				
			}
	}

}
