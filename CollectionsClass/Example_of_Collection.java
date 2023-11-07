package CollectionsClass;

import java.util.*;;

public class Example_of_Collection
{

	public static void main(String[] args)
	{
		List<String> laptopList = new ArrayList<>();
	      laptopList.add("HCL");
	      laptopList.add("Apple");
	      laptopList.add("Dell");
	      Comparator<String> com = (String o1, String o2)->o1.compareTo(o2);

	      Collections.sort(laptopList,com);

	      for (String name : laptopList) {
	         System.out.println(name);
	      }

	}

}

//Output:
//			Apple
//			Dell
//			HCL

