/* toSting()	asList()	deepToString()*/
package Array_Topic;

import java.util.Arrays;
public class Arrays_class_methods 
{

	public static void main(String[] args) 
	{
		String a[] = {"Learn","Coding","Keypoints","Education"};
		System.out.println("toString()= "+Arrays.toString(a));
		System.out.println("asList()= "+Arrays.asList(a));
		
		int arr[][] = {{10,20},{30,40}}; 
		System.out.println("deepToString()= "+Arrays.deepToString(arr));

	}

}
/*
 
Output:
			toString()= [Learn, Coding, Keypoints, Education]
			asList()= [Learn, Coding, Keypoints, Education]
			deepToString()= [[10, 20], [30, 40]]

*/
