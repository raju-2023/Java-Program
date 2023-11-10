package Array_Topic;
import java.util.Scanner;
public class Transpose_of_Matrix 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[3][3];
		Scanner r = new Scanner(System.in);
		System.out.print("Enter Array Data : \n");
		for(int i=0;i<=2;i++)  //for rows
		{
			for(int j=0;j<=2;j++)  //for columns
			{
				a[i][j] = r.nextInt();
			}
		}
		
		System.out.print("Array Matrix : \n");
		for(int i=0;i<=2;i++)  //for rows
		{
			for(int j=0;j<=2;j++)  //for columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.print("Transpose Matrix : \n");
		for(int i=0;i<=2;i++)  //for rows
		{
			for(int j=0;j<=2;j++)  //for columns
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.print("\n");
		}
	}
}


/*

Output:
		Enter Array Data : 
		10 20 30 40 50 60 70 80 90
		Array Matrix : 
		10 20 30 
		40 50 60 
		70 80 90 
		Transpose Matrix : 
		10 40 70 
		20 50 80 
		30 60 90 
*/
