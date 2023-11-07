package Annotation;
@FunctionalInterface
interface Demo
{
	void disp();
	//void disp2();
}
//this is parent class
@Deprecated
class Plane
{
	public void planeFilesAtGoodHeight()
	{
		System.out.println("Plane is flying");	
	}
}
//this is child class or subclass

class CargoPlane extends Plane
{
	
	//overriden method from parent class
	@Override
	public void planeFilesAtGoodHeight()
	{
		System.out.println("Cargoplane Flies low");
	}
}

public class LaunchAn 
{

	public static void main(String[] args) 
	{
		//object of child class
		Plane cp=new CargoPlane();
		cp.planeFilesAtGoodHeight();
		
	}

}
