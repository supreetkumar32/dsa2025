package math;

public class Palindrome {

	public static void main(String[] args) {
		int z=777;
		int n=z;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		if(rev==z) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}

	}

}
