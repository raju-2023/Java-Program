package Decision_Making_Statements;
import java.util.Scanner;
public class IF_Statement 
{
	public static void main(String[] args) 
	{
		int age;
		System.out.print("Enter Your Age: ");
		Scanner r = new Scanner(System.in);
		age = r.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible for Vote");
		}
		System.out.print("Thank You!!!!!!!!!");
	}
}
/*Output:
			Enter Your Age: 20 
			You are Eligible for Vote
			Thank You!!!!!!!!!
*/