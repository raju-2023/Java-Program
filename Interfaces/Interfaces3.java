package Interfaces;

interface Computer
{
	void compileCode();	
}

class Laptop implements Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}

class Desktop implements Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors, faster");
	}
}
class Developer
{
	
	public void buildApp(Computer obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
	
}

public class Interfaces3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Laptop obj = new Laptop();
		Computer obj = new Desktop();
		
		Developer dev = new Developer();
		dev.buildApp(obj);
	}

}
