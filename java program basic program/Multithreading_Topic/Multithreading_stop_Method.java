package Multithreading_Topic;
class F extends Thread
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
public class Multithreading_stop_Method 
{

	public static void main(String[] args) 
	{
		F t1 = new F();
		F t2 = new F();
		F t3 = new F();
		
		t1.setName("t1 thread");
		t2.setName("t2 thread");
		t3.setName("t3 thread");
		
		t1.start();
		t2.start();
		t3.start();
		
		t2.stop();
	}

}
