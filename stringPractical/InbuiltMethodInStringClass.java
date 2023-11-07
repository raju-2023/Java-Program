package stringPractical;

public class InbuiltMethodInStringClass {

	public static void main(String[] args) {
		String str = "PW Skill Java";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.length());
		//int length = str.length();
		System.out.println(str.substring(3,8));
		System.out.println(str.indexOf("S"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
	}

}
