
/*Array Method:-   sort() used here :-These method sort element in ascending order*/
package Array_Topic;
import java.util.Arrays;
import java.util.Scanner;
public class Methods_sort_ 
{
	public static void main(String[] args) 
	{
		int a[] =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Elements in Array : ");
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.print("Sort() Method Sort the element in Ascending Order : ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
	}
}
/*
Output:					
						Enter 	Elements in Array : 50 20 70 60 90
Sort() Method Sort the element in Ascending Order : 20 50 60 70 90 
*/