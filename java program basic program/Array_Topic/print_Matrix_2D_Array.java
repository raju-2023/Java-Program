//Matrix Program to print using  2D array
package Array_Topic;
import java.util.Scanner;
public class print_Matrix_2D_Array 
{

	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter Array Element : ");
		for(int i=0;i<2;i++)   //rows
		{
			for(int j=0;j<2;j++)   //columns
			{
				a[i][j] = r.nextInt();
			}
		}
		System.out.print("Matrix : \n");
		for(int i=0;i<2;i++)   //rows
		{
			for(int j=0;j<2;j++)   //columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

/*Output: 
			Enter Array Element : 50 60 40 90
			Matrix : 
			50 60 
			40 90
*/ 
