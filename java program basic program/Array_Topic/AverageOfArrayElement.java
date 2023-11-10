/*Find Average of Array Elements*/
//1.a[5] = 10,20,30,40,50------->150
//2.avg=150/5
package Array_Topic;
import java.util.Scanner;
public class AverageOfArrayElement 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int sum=0;
		double avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Array Elements");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<5;i++)
		{
			sum=a[i]+sum;
		}
		avg=sum/5.0;
		System.out.print("\nAddition: "+sum+"\nAverage: "+avg);
	}
}
/*Output:
			Enter Array Elements
			10 20 30 40 50
			Array Elements10 20 30 40 50 
			Addition: 150
			Average: 30.0
*/
