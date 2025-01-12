package Recursion;

public class sumOfN {

	public static int sumOfFirstN(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumOfFirstN(n-1);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int n=5;
        System.out.println(sumOfFirstN(n));
        System.out.println(factorial(n));

	}

}
