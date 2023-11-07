package stringPractical.mutable;

public class FinalvsImmutable {

	public static void main(String[] args) {
//		final int a=10;
//		a=20;
//		System.out.println(a);
		
		//final StringBuffer sb = new StringBuffer("Virat");
		//sb.append("kohli");
		//System.out.println(sb);
		//sb = new StringBuffer("Sachin");
		//System.out.println(sb);
		
		
//		StringBuffer sb  = new StringBuffer();
//		System.out.println(sb.capacity());//Output:16
//		sb.append("abcdefghijklmnop");
//		System.out.println(sb.capacity());
//		sb.append("a");
//		System.out.println(sb.capacity());//how many character you can add
//		System.out.println(sb.length());//how many character are present
	
		
//		StringBuffer sb2 = new StringBuffer("Sachin");
//		System.out.println(sb2);
//		System.out.println(sb2.capacity());
//		System.out.println(sb2.charAt(1));
//		sb2.setCharAt(1, 'A');//SAachin or SAchin
//		System.out.println(sb2);
		
		
//		StringBuilder sb = new StringBuilder(150);
//		System.out.println(sb.capacity());
//		sb.append("java");
//		System.out.println(sb);
//		sb.trimToSize();
//		System.out.println(sb.capacity());
		
		
		StringBuilder sb = new StringBuilder("pwjava");
		System.out.println(sb);
		System.out.println(sb.reverse());

		
	}

}
