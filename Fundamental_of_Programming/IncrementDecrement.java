package Fundamental_of_Programming;

public class IncrementDecrement 
{

	public static void main(String[] args) 
	{
		int a=5;
		int b=6;
		
		int c=a++;//post increment
		System.out.println("Print C = "+c);
		
		System.out.println("After post increment to print A = "+a);
		System.out.println("*********************************");
		
		int d = ++a;//pre increment
		System.out.println("Print D = "+d);
		System.out.println("After pre increment to print A = "+a);
		System.out.println("*********************************");
		
		int e =b--;//post decrement
		System.out.println("Print E = "+e);
		System.out.println("After post decrement to print B = "+b);
		System.out.println("*********************************");
		
		int f =--b;//pre decrement
		System.out.println("Print F = "+f);
		System.out.println("After pre decrement to print B = "+b);
		System.out.println("*********************************");
	}
}

/*
Output:
		Print C = 5
		After post increment to print A = 6
		*********************************
		Print D = 7
		After pre increment to print A = 7
		*********************************
		Print E = 6
		After post decrement to print B = 5
		*********************************
		Print F = 4
		After pre decrement to print B = 4
		*********************************

*/