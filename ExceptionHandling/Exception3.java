package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3
{
	public static void main(String[] args)
	{
		int num = 0;
		try (Scanner sc = new Scanner(System.in)) //try with resources
		{
		 
		
			num = sc.nextInt();
			
		}
		
		
		
		System.out.println(num);
	}
}

//DRY=Do not repeat yourself
