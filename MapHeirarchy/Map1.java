package MapHeirarchy;
import java.util.*;


public class Map1 {

	public static void main(String[] args) {
	HashMap hm1=new HashMap();
	//hm1.put(null,null);//Entry
	hm1.put(02, "Rohit");
	hm1.put(03, "Rohan");
	hm1.put(04, "Rohan");
	//hm1.put(04, "Rohan");
	System.out.println(hm1);
	System.out.println("********************************************************");
	
	HashMap hm2=new HashMap();
	hm2.put("Virat", "Rohit");
	hm2.put("Rohit", "Rohan");
	hm2.put("Hyder", "Rohan");
	System.out.println(hm2);
	System.out.println("********************************************************");
	
	LinkedHashMap lhm=new LinkedHashMap();
	lhm.put("Virat", "Rohit");
	lhm.put("Rohit", "Rohan");
	lhm.put("Hyder", "Rohan");
	System.out.println(lhm);
	}

}
