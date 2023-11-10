package Multithreading_Topic;

class Table
{
	public synchronized void printTable(int n)  //t1 and t2
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}

class thread3 extends Thread
{
	Table t;
	thread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class thread4 extends Thread
{
	Table t;
	thread4(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(7);
	}
}

class Method_Level_Synchronization 
{

	public static void main(String[] args)
	{
		Table obj = new Table();    //obj = 1 lock
		
		thread3 t1 = new thread3(obj);
		thread4 t2 = new thread4(obj);
		
		t1.start();
		t2.start();

	}

}


/*Output:
 * 			7
			14
			21
			28
			35
			42
			49
			56
			63
			70
			5
			10
			15
			20
			25
			30
			35
			40
			45
			50
*/
