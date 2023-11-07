package StreamAPI;
import java.util.*;
public class Example_of_Streams 
{

	public static void main(String[] args) 
	{
		  List<String> laptopList = new ArrayList<>();
	      laptopList.add("HCL");
	      laptopList.add("Apple");
	      laptopList.add("Dell");
	      laptopList.stream().sorted().forEach(System.out::println);
	}
}

//Output:
//	Apple
//	Dell
//	HCL

