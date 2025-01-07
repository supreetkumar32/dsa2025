package sstrings;

public class Reverse {

	public static void main(String[] args) {
		String s="Supreet";
		//char[] c=s.toCharArray();
//		String ans="";
//		for(int i=s.length()-1;i>=0;i--) {
//			ans=ans+c[i];
//		}
		String ans="";
		for(int i=s.length()-1;i>=0;i--) {
			ans=ans+s.charAt(i);
		}
		System.out.println(ans);

	}

}
