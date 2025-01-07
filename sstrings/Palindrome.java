package sstrings;

public class Palindrome {

	public static void main(String[] args) {
		String s="mom";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a=a+s.charAt(i);
		}
		if(s.equals(a)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}

	}

}
