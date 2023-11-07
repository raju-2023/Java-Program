package Interfaces;

abstract class Vehicle 
{

	abstract public int getNumberOfWheel();
}

class Truck extends Vehicle 
{

	public int getNumberOfWheel() { return 12; }
}

class Auto extends Vehicle 
{

	public int getNumberOfWheel() { return 3; }
}

public class AbsModExam 
{

	public static void main(String[] args) 
	{
		Truck b = new Truck();
		Auto a = new Auto();
		System.out.println("Number of wheels in Truck is"+ " " + b.getNumberOfWheel());
		System.out.println("Number of wheels in Auto is"+ " " + a.getNumberOfWheel());
	}

}
