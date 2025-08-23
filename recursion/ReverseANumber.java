package recursion;

public class ReverseANumber {
    public static int reverseNumber(int num, int rev) {
        
        if (num == 0) {
            return rev;
        }
        // Extract last digit and build the reverse
        rev = rev * 10 + (num % 10);
        return reverseNumber(num / 10, rev);
    }

	public static void main(String[] args) {
		int x=4567;
		int reversenumber=0;
		int ans=reverseNumber(x,reversenumber);
		

	}

}
