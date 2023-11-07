package Fundamental_of_Programming;

public class typeCasting 
{

	public static void main(String[] args) 
	{
		int a=45;
		double b;
		b = a;
		System.out.println(b);
		
		double num1 = 45.5;
		int num2;
		num2=(int)num1;
		System.out.println(num2);
		
		int n1 = 12;
		int n2 = 5;
		float res = n1/n2;
		System.out.println(res);
		
		//Area of rectangle
		double L=11.1;
		double B =19.5;
		double area;
		area =L*B;
		System.out.println(area);
		
		//Volume of cube
		double side1 =3;
		double side2 =3;
		double side3 =3;
		double volumeOfCube;
		
		volumeOfCube = side1*side2*side3;
		System.out.println(volumeOfCube);
		
		
	}

}
