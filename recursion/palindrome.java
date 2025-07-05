package recursion;

public class palindrome {
	public static boolean isPalindrome(String s,int i, int j) {
		char[]c=s.toCharArray();
		if(i>=j) return true;
		if(c[i]!=c[j]) return false;
		return isPalindrome(s,i+1, j-1);
		
	}

	public static void main(String[] args) {
		String s="momk";
		int i=0,j=s.length()-1;;
		System.out.println(isPalindrome(s,i,j));

	}

}
