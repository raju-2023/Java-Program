/* Java program to copy all elements of one array to another */
// first array a[]=10 20 30---copy to--- second array b[]=10 20 30
//both array size it should be same and same type(Ex-int,String etc.)
//Jis array ke element copy kar rahe han hum doosre array mae uska size copy kar rahe array ke barabar ho ya uska size ka bada size ho but chota nahi hona chahiye!
package Array_Topic;
import java.util.Scanner;
public class CopyArray 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Elements in an Array");
		
		for(int i=0;i<5;i++)
		{
			a[i] = r.nextInt();
		}
		System.out.println("First Array Elements ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nSecond Array Elements ");
		for(int i=0;i<5;i++)
		{
			b[i] = a[i];
			System.out.print(b[i]+ " ");
		} 
	}
}

/*Output:
			Enter Elements in an Array
			10 20 30 40 50
			First Array Elements 
			10 20 30 40 50 
			Second Array Elements 
			10 20 30 40 50 
*/