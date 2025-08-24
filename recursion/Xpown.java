package recursion;

public class Xpown {
	
	public static double xpown(double x, int n) {
		long N=n;
		if(N<0) {
			N=-N;
			x=1/x;
		}
		return fastpow(x,N);
	}
	
	public static double fastpow(double x,long n) {
		if(n==0) return 1;
		double half=fastpow(x,n/2);
		if(n%2==0) {
			return half*half;
		}else {
			return half * half * x;
		}
	}

	public static void main(String[] args) {
		double x=2;
		int n=-1;
		double ans=xpown(x,n);
		System.out.println(ans);

	}

}
