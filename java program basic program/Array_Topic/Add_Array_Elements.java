				/*Find Summ of Array Elements*/
package Array_Topic;
import java.util.Scanner;
public class Add_Array_Elements 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int sum = 0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Elements in an Array ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = r.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum = a[i]+sum;
		}
		System.out.println("\nAddition of Array Elements= "+sum);
	}
}
/*Output:
			Enter Elements in an Array 
			10 20 30 40 50
			Array Elements 
			10 20 30 40 50 
			Addition of Array Elements= 150
*/
