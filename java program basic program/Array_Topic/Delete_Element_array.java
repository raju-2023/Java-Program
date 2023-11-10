/*Delete element in an array*/
//a[3] = 45 67 23
//loc = 1
//a[3-1] = 45 23

package Array_Topic;
import java.util.Scanner;
public class Delete_Element_array 
{

	public static void main(String[] args) 
	{
		int size,loc,i;
		Scanner r = new Scanner(System.in);
		System.out.print("Entter Array size : ");
		size = r.nextInt();
		
		int a[] = new int[size];
		System.out.print("Enter Array Element : ");
		for(i=0;i<size;i++)
		{
			a[i] = r.nextInt();
		}
		System.out.print("Enter Array location : ");
		loc = r.nextInt();
		for(i=loc;i<size-1;i++)
		{
			a[i] = a[i+1];
		}
		size--;
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
