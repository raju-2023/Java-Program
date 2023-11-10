package Multithreading_Topic;

class Multithreading_Suspend_And_Resume_Method extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=3;i++)
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Multithreading_Suspend_And_Resume_Method t1 = new Multithreading_Suspend_And_Resume_Method();
		Multithreading_Suspend_And_Resume_Method t2 = new Multithreading_Suspend_And_Resume_Method();
		Multithreading_Suspend_And_Resume_Method t3 = new Multithreading_Suspend_And_Resume_Method();
		
		t1.setName("Raj");
		t2.setName("Gill");
		t3.setName("Sen");
		
		t1.start();
		
		t2.start();
		t2.suspend();   //pause
		
		t3.start();
		t2.resume();   //restart
		
	}

}
