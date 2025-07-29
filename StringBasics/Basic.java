package StringBasics;

public class Basic {

	public static void main(String[] args) {
		String s=new String("Supreet");
		String s1="     Namaste ji      ";
		System.out.println(s);
		System.out.println(s1 + "length:" +s1.length());
		System.out.println(s.equals(s1));//false
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String s2="This is a demo";
		System.out.println(s2.replace("is", "was"));
		s2.replaceAll("is", "was");
		String s3="subsequence c cx sacbv dsac";
		System.out.println(s3.substring(3,11));
		
		String a="Supreet";
		System.out.println(a.indexOf('u'));
		System.out.println(a.lastIndexOf('u'));
		System.out.println(a.charAt(4));
		System.out.println(a.contains("r"));
		System.out.println(a.startsWith("s"));
		

	}

}
