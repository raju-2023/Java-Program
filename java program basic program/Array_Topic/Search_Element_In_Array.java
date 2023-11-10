				/*Java program to search an element in array */
package Array_Topic;
import java.util.Scanner;
public class Search_Element_In_Array 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int n,count=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Elements in an Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = r.nextInt();
		}
		System.out.println("Array Elements: ");
		for( int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter Search Elements: ");
		n = r.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == n)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Element Found: "+n);
			System.out.println("Element Found: "+count+"  times");
		}
		else
		{
			System.out.println("Element Not Found!!!!!!!");
		}
	}
}
/*Output:
			Enter Elements in an Array: 
			10 20 20 20 30
			Array Elements: 
			10 20 20 20 30 
			Enter Search Elements: 20
			Element Found: 20
			Element Found: 3  times

*/


/*Output:
			Enter Elements in an Array: 
			10 20 30 40 50
			Array Elements: 
			10 20 30 40 50 
			Enter Search Elements: 80
			Element Not Found!!!!!!!
*/