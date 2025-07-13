package math;

public class ReverseNumber {

	public static void main(String[] args) {
		int x=4567;
		int reversenumber=0;
		while(x>0) {
			int rem=x%10;
			reversenumber=reversenumber*10+rem;
			x=x/10;
			}
		System.out.println(reversenumber);
	}

}
