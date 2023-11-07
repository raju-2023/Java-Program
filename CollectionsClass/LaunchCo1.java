package CollectionsClass;
import java.util.*;

public class LaunchCo1 {

	public static void main(String[] args) {
		 
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		
		System.out.println(al);
		System.out.println("***************************************************");
		Collections.sort(al);
		
		System.out.println(al);

		
		ArrayList<String>al2=new ArrayList<String>();
		
		al2.add("PW");
		al2.add("Hyder");
		al2.add("Java");
		al2.add("Rohan");
	
		System.out.println("***************************************************");
		System.out.println(al2);
		
		Collections.sort(al2);
		System.out.println("***************************************************");
		System.out.println(al2);
		System.out.println("***************************************************");
		ArrayList al3=new ArrayList();
		
		al3.add(10);
		al3.add(20);
		al3.add(20);
		al3.add(40);
		al3.add(50);
	
		
		System.out.println(al3);
		System.out.println("***************************************************");
		
		int index=Collections.binarySearch(al3, 60);
		System.out.println("Index is:" +index);
		System.out.println("***************************************************");
		
		Collections.rotate(al3, 3);
		System.out.println(al3);
		System.out.println("***************************************************");
		
		Collections.shuffle(al3);
		System.out.println(al3);
		System.out.println("***************************************************");
		System.out.println(Collections.frequency(al3, 20));
		
		
	}

}
