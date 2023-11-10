package Array_Topic;

import java.util.Scanner;
import java.util.Arrays;

public class Methods_copyOf_ 
{
	public static void main(String[] args) 
	{
		int a1[] =new int[5];
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("              Enter Elements in First Array : ");
				for(int i=0;i<a1.length;i++)
					{
						a1[i]=sc.nextInt();
					}
			
			int a2[] = Arrays.copyOf(a1, 5);
			System.out.print("Copy First Array Elements into Second Array : ");
				for(int i=0;i<a2.length;i++)
					{
						System.out.print(a2[i]+" ");
					}
	}
}
/*	a2[5] = 50;  //enter element in array a2
	System.out.print("Copy First Array Elements into Second Array : ");
	for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}
}
*/
	
/* Output:
				Enter Elements in First Array 	: 1 2 3 4 5
	Copy First Array Elements into Second Array : 1 2 3 4 5 
*/