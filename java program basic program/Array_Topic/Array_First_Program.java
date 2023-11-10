package Array_Topic;

import java.util.Scanner;

public class Array_First_Program 
{

	public static void main(String[] args)
	{
		//int a=10,b=20,c=30,d=40,e=50;
		//int a[] = {10,20,30,40,50};
		//System.out.println(a[3]);
		
		/* int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		/*This Program is writtem by dynamically*/
		int size,i;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of Array:  ");
		size = r.nextInt();
		int a[] = new int [size];

		for(i=0;i<size;i++)
		{
			a[i] = r.nextInt();
			
		}
		System.out.println("Printed Array Elements");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}

}

/*Dyanamic Array Output:
Enter size of Array:  
3
10
20
30
Printed Array Elements
10 20 30 
*/
