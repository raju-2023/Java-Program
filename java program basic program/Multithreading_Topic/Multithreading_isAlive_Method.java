package Multithreading_Topic;
class G extends Thread
{
	public void run()
	{
		System.out.println("isAlive method program..!");
	}
}

public class Multithreading_isAlive_Method 
{

	public static void main(String[] args) 
	{
		G t1 = new G();
		G t2 = new G();
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		
		System.out.println(t2.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
		

	}

}
