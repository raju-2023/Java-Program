package Multithreading_Topic;
class thread1 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
			Thread.yield();
		}
	}
}

class thread2 extends Thread
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
public class Multithreading_Yield_Method
{

	public static void main(String[] args) 
	{
		thread1 t1 = new thread1();
		thread1 t2 = new thread1();
		
		t1.start();
		t2.start();
	}

}
