package recursion;

public class fibonacci {

	//fibonacci 0  1 1 2 3 5
	public static int fibo(int n) {
		if(n<=1) return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println(fibo(n));

	}

}
