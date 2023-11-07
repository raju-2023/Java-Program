package stringPractical;

public class stringCompare {

	public static void main(String[] args) {
//		String s1 = "pwskill";
//		String s2 = new String("pwskill");
//		System.out.println(s1 == s2);//output:false
//		System.out.println(s1.equals(s2));//output:true
		
//		String s1 = "pwskill";
//		String s2 = "pwskill";
//		String s3 = "pwJAVA";
//		System.out.println(s1 == s2);//output:true
//		System.out.println(s1 == s3);//output:false
//		System.out.println(s1.equals(s2));//output:true
//		System.out.println(s1.equals(s3));//output:false
		
//		String s1 = "pwskill";
//		String s2 = new String("pwskill");
//		String s3 = new String("pwskill");
//		
//		System.out.println(s1 == s2);//output:false
//		System.out.println(s1 == s3);//output:false
//		System.out.println(s2 == s3);//output:false
//		
//		System.out.println(s1.equals(s2));//output:true
//		System.out.println(s1.equals(s3));//output:true
//		System.out.println(s2.equals(s3));//output:true
		
		
		String s1 = "pwskill";
		String s2 = new String("PWskill");
		String s3 = new String("pwskill");
		
		System.out.println(s1.equalsIgnoreCase(s2));//output:true
		System.out.println(s2.equalsIgnoreCase(s3));//output:true
		System.out.println(s1.equals(s2));//output:false
		System.out.println(s2.equals(s3));//output:false
	}

}
