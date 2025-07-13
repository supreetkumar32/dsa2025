package math;

public class PrimeNumber {
	
	   static boolean isPrime(int n)
	    {
	        // Corner case
	        if (n <= 1)
	            return false;

	        // Check from 2 to sqrt(n)
	        for (int i = 2; i <= Math.sqrt(n); i++)
	            if (n % i == 0)
	                return false;

	        return true;
	    }

	    // Driver Program
	    public static void main(String args[])
	    {
	        int num = 4;
	        if (isPrime(num)) {
	            System.out.println(num + " is prime");
	        }
	        else {
	            System.out.println(num + " is not prime");
	        }
	    }

}
