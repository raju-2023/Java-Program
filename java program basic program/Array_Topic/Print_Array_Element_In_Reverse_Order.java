/* Print array elements in reverse order */
//inputa[5]= 10 20 30 40 50
//output   = 50 40 30 20 10
package Array_Topic;
import java.util.Scanner;
public class Print_Array_Element_In_Reverse_Order 
{

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner r = new Scanner(System.in);
		
				System.out.println("Enter elements in array ");
				for(int i=0;i<a.length;i++)
				{
					a[i] = r.nextInt(); 
				}
			
				System.out.println("Array Elements Print ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" "); 
				}
			
				System.out.println("\nArray Elements Reverse In Order ");
				for(int i=a.length-1;i>=0;i--)
				{
					System.out.print(a[i]+" "); 
				}
	}
}
/*Output:
			Enter elements in array 
			10 20 30 40 50
			Array Elements Print 
			10 20 30 40 50 
			Array Elements Reverse In Order 
			50 40 30 20 10 
*/