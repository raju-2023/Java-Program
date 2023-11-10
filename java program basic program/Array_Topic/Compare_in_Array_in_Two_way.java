/*Compare Arrays*/

// 1. ==
// 2. equals()


package Array_Topic;
import java.util.Scanner;
import java.util.Arrays;


public class Compare_in_Array_in_Two_way 
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
//		if(a == b) //These operator used :they give result:Both are not Equals
		if(Arrays.equals(a,b)) //equals() method use to give result:Both are Equals
		{
			System.out.print("Both are Equals");
		}
		else
		{
			System.out.print("Both are not Equals");
		}
	}
}
