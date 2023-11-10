/*Array Method:-   equals() method used here :-These method compare two array element 
  and tell me these array are equal or not */

package Array_Topic;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_equals_ 
{
	public static void main(String[] args) 
	{
		int a1[] =new int[5];
		int a2[] =new int[5];
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter Elements in First Array  : ");
				for(int i=0;i<a1.length;i++)
					{
						a1[i]=sc.nextInt();
					}
			System.out.print("Enter Elements in Second Array : ");
				for(int i=0;i<a2.length;i++)
					{
						a2[i]=sc.nextInt();
					}
				boolean b = Arrays.equals(a1,a2);
				System.out.print("Both Arrays are equals : "+b);
	}
}

/*Output:
		 	Enter Elements in First Array  : 1 2 3 4 5 
			Enter Elements in Second Array : 1 2 3 4 5
			Both Arrays are equals : true
*/

/*Output:
			Enter Elements in First Array  : 1 2 3 4 5
			Enter Elements in Second Array : 2 3 4 5 6
			Both Arrays are equals : false
*/



/*
// 		This one code also compare elements quantity in an array is same or not.
// 		So, elements quantity is same result is true & 
// 		elements quantity is not same result is false  
  
 
		public class Methods_equals_ 
		{
			public static void main(String[] args) 
			{
		 		int a1[] =new int[9];
				int a2[] =new int[9];
				Scanner sc = new Scanner(System.in);
				boolean b = Arrays.equals(a1,a2);
				System.out.print("Both Arrays are equals : "+b);
			}
		}		

*/
