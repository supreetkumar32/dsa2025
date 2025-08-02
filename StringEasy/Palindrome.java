package StringEasy;

public class Palindrome {

	public static void main(String[] args) {
		String s="mom";
//		String a="";
//		for(int i=s.length()-1;i>=0;i--) {
//			a=a+s.charAt(i);
//		}
//		if(s.equals(a)) {
//			System.out.println("It is a palindrome");
//		}else {
//			System.out.println("It is not a palindrome");
//		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		if(sb.toString().equals(s)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}

	}

}
