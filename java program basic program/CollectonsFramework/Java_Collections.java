package CollectonsFramework;

import java.util.ArrayDeque;

public class Java_Collections 
{

	public static void main(String[] args)
	{
		ArrayDeque<String> Name = new ArrayDeque<>();  //FIFO
		Name.add("Ankit");
		Name.add("Ankush");
		Name.add("Altaf");
		
		System.out.println(Name);
		Name.remove();
		System.out.println(Name);
		
		
		
	}

}
