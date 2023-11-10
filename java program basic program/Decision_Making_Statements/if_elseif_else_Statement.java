/*if_else if_else ladder statement*/
package Decision_Making_Statements;
import java.util.*;
public class if_elseif_else_Statement 
{
	public static void main(String[] args) 
	{
		int marks;
		System.out.println("Enter Marks : ");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		if(marks>=80)
		{
			System.out.println("Topper");
		}
		else if(marks<80 && marks>=60)
		{
			System.out.println("First Division");
		}
		else if(marks<60 && marks>=45)
		{
			System.out.println("Second Division");
		}
		else if(marks<45 && marks>=33)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

/*
Output:
Enter Marks : 
96
Topper
*/

/*
Output:
Enter Marks : 
65
First Division
*/

/*
Output:
Enter Marks : 
55
Second Division
*/

/*
Output:
Enter Marks : 
39
Third Division
*/

/*
Output:
Enter Marks : 
24
Fail
*/