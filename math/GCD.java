package math;

public class GCD {
	
	 public static int gcd(int a, int b) {
	        while(a > 0 && b > 0) {
	            // If a is greater than b,
	            // subtract b from a and update a
	            if(a > b) {
	                // Update a to the remainder
	                // of a divided by b
	                a = a % b;
	            }
	            // If b is greater than or equal
	            // to a, subtract a from b and update b
	            else {
	                // Update b to the remainder
	                // of b divided by a
	                b = b % a;
	            }
	        }
	        // Check if a becomes 0,
	        // if so, return b as the GCD
	        if(a == 0) {
	            return b;
	        }
	        // If a is not 0,
	        // return a as the GCD
	        return a;
	    }


    // Driver code
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println(gcd(a, b)); 
    }

}
